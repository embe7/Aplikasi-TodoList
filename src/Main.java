import java.util.Scanner;

public class Main {

    public static String[] model = new String[10];

    public static void main(String[] args) {

        

    }

    /**
     * Menampilkan todo list
     */

    public static void showTodoList(){
        System.out.println("TODOLIST");
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

    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (var i = (number - 1); i < model.length; i++){
                if (i ==(model.length - 1)){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }
    //Method Test Remove TodoList
//    public static void testRemoveTodoList(){
//        addTodoList("satu");
//        addTodoList("dua");
//        addTodoList("Tiga");
//        addTodoList("Empat");
//
//        var result = removeTodoList(2);
//
//        System.out.println(result);
//        showTodoList();
//    }

    /**
     * Input Data
     */
    public static String input(String info){
        Scanner scanner = new Scanner(System.in);

        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    //Method untuk mengetes input
//    public static void testInput(){
//        var name = input("Name");
//        System.out.println("Hi " + name);
//    }


    /**
     * Menampilkan view todo list
     */

    public static void viewShowTodolist(){
        while (true){
            showTodoList();
            System.out.println("Menu :");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if (input.equals("1")){
                viewAddTodoList();
            }else if (input.equals("2")){
                viewRemoveTodoList();
            }else if(input.equals("x")) {
                break;
            }else {
                System.out.println("Pilihan Tidak Dimengerti");
            }
        }
    }
    //Method untuk test viewShowTodoList
//    public static void testViewShowTodoList(){
//        addTodoList("satu");
//        addTodoList("dua");
//        addTodoList("tiga");
//        addTodoList("empat");
//        addTodoList("lima");
//        viewShowTodolist();
//    }

    /**
     *  Menampilkan view menambahkan todo list
     */

    public static void viewAddTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");
        if (todo.equals("x")){
            //batal
        }else {
            addTodoList(todo);
        }
    }

    //Method untuk test viewAddTodoList
//    public static void testViewAddTodoList(){
//        viewAddTodoList();
//        showTodoList();
//    }

    /**
     *  Menampilkan view menghapus todo list
     */

    public static void viewRemoveTodoList(){
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor yang dihapus (x Jika Batal)");

        if (number.equals("x")){
            //batal
        }else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success){
                System.out.println("Gagal menghapus TodoList " + number);
            }
        }
    }
}
