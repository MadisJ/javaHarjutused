package teema1;


import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);
        tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);


    }
    public void tsykkel (Foor foor, int suund) {
        int i = 0;
        int  k = suund;
        while (k < 5) {
            if (k != 0) {

                foor.vahetaPunast();
                foor.paus(9);
                foor.vahetaKollast();
                foor.paus(1);
                foor.vahetaKollast();
                foor.vahetaPunast();
            }
                foor.vahetaRohelist();
                foor.paus(3);
                while (i < 11) {
                    foor.vahetaRohelist();
                    foor.paus(0.3);
                    i = i + 1;
                }
                foor.vahetaKollast();
                foor.paus(1);
                foor.vahetaKollast();
                k = k + 1;
                i = 0;
            }
            foor.vahetaPunast();
            foor.paus(2);
            foor.vahetaPunast();

        }
    }


