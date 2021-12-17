public class Main {

    public static String[] model = new String[10];

    public static void main(String[] args) {

    }

    /**
     * Menampilkan todo list
     */

    public static void showTodoList(){
        //membuat nomor
        for (var i = 0; i < model.length){
            var todo = model[i];
            var numbers = i + 1;

            if (todo != null){
                System.out.println(numbers + ". " + todo);
            }
        }


    }

    /**
     * Menambah todo ke list
     */

    public static void addTodoList(){

    }

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
