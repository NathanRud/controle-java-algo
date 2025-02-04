import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 4, 3, 6, 5, 7, 9};
        ArrayList<Integer> magique = new ArrayList<>();
        int tmp = 0;

        for (int i = 1; i < tab.length; i++) {

            for (int j = 1; j < (tab.length - 1); j++) {
                if (tab[j - 1] > tab[j]) {

                    tmp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = tmp;

                }

            }
            if (tab[i] - 1 != tab[i - 1]) {
                magique.add(tab[i] - 1);


            }
        }
        System.out.println("Nombre magique : " + magique);
    }
}