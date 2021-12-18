public class Main {

    public static String[] model = new String[10];

    public static void main(String[] args) {

        

    }

    /**
     * Menampilkan todo list
     */

    public static void showTodoList(){
        //membuat nomor
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var number = i + 1;

            if (todo != null){
                System.out.println(number + ". " + todo);
            }
        }
    }
    //test showTodoList
//    public static void testShowTodoList(){
//        model[0] = "Belajar Java";
//        model[1] = "Latihan Java";
//
//        showTodoList();
//    }

    /**
     * Menambah todo ke list
     */

    public static void addTodoList(String todo){
        //cek model penuh
        var isFull = true;
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        //jika penuh resize ukuran array 2x lipat
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        //tambahkan ke posisi yang data array nya NULL
        for (var i = 0; i < model.length;i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }


    }
    //test addTodoList
//    public static void testAddTodoList(){
//        for (int i = 0; i < 25; i++){
//            addTodoList("todo ke " + i);
//        }
//
//        showTodoList();
//    }

    /**
     * Menghapus todo dari list
     */

    public static void removeTodoList(){

    }

    /**
     * Menampilkan view todo list
     */

    public static void viewShowTodolist(){

    }

    /**
     *  Menampilkan view menambahkan todo list
     */

    public static void viewAddTodoList(){

    }

    /**
     *  Menampilkan view menghapus todo list
     */

    public static void viewRemoveTodoList(){

    }
}
