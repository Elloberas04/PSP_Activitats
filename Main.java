public class Main {
    public static void main(String[] args)
    {
        Menu menu = new Menu("ACTIVITATS", "Activitat 1", "Activitat 2", "Activitat 3", "Activitat 4", "Activitat 5");
        Menu menu2 = new Menu("QUE VOLEU FER??", "Llegir arxiu", "Escriure arxiu");
        Activitat1 activitat1 = new Activitat1();
        Activitat2 activitat2 = new Activitat2();
        Activitat3 activitat3 = new Activitat3();
        Activitat4 activitat4 = new Activitat4();
        Activitat5 activitat5 = new Activitat5();

        int answer = -1;

        while (answer != 0)
        {
            answer = menu.getOption();

            switch (answer)
            {
                case 1 -> activitat1.activitat1();
                case 2 -> activitat2.activitat2();
                case 3 -> activitat3.activitat3();
                case 4 -> activitat4.activitat4();
                case 5 -> {
                    int answer2 = -1;

                    while (answer2 != 0)
                    {
                        answer2 = menu2.getOption();


                        switch (answer2)
                        {
                            case 1 -> activitat5.llegir("./test.txt");
                            case 2 -> activitat5.escriure("./test.txt");
                            default -> menu.doNothing();
                        }
                    }
                }
                default -> menu.doNothing();
            }
        }
    }
}
