package Class10;

public class E22DArrays {
    public static void main(String[] args) {

        String [][] names=
                {{"Hind", "Mikhail", "Ismael", "Ahmad"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "John Ahmed", "Mohammad"},
                        {"Gui", "Backend", "Front", "API"}
                };
        String[] row=names[2];
        //System.out.println(row[3]);
        //System.out.println(Array.toString(firstRow));

        for(String name:row){
            System.out.println(name);
        }
    }
}
