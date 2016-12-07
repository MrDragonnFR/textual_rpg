package mrdragonn.gurvv29.Textual_rpg;

import java.util.Scanner;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);
	static String ver = "Alpha 1.0";
	
	public static void start() throws InterruptedException {
			// version //
			
		int rep = 0;
			Print("__________________________");
			Print("     THE TEXTUAL RPG      ");
			Print("__________________________");
			Print("");
			Print("1) Nouvelle partie");
			Print("");
			Print("2) Charger");
			Print("");
			Print("3) Plus d'infos");
			Print("");
			Print("4) Quitter");
			Print("");
			
			do{
				Print("Que Voulez vous faire ?");
				rep = sc.nextInt();
				if(rep == 1){
					Load.NewGame();
					rep = 0;
				}
				else if(rep == 2){
					Load.Loading();
					rep = 0;
				}
				else if(rep == 3){
					More();
					rep = 0;
				}
				else if(rep == 4){
						Thread.sleep(1000);
						Print("Extinxion en cours ... Au revoir .....");
					System.exit(0);
				}else{
					Print("Veuillez taper un chiffre correct !");
				}
			}while(rep != 1 || rep != 2 || rep != 3 || rep != 4);
			
		}

			public static void More() {
				Print("Le Textual RPG est un");
				Print("RPG avec du texte.");
				Print("");
				Print("Votre but est de tuer");
				Print("des monstres pour");
				Print("gagner des PO (Pièces d'or)");
				Print("afin d'augmenter en niveau");
				Print("");
				Print("Les combats se passent");
				Print("tour par tour entre");
				Print("le joueur et le monstre.");
				Print("");
				Print("'Preux chevallier, ta mission nathan plus !'");
				Print("Citation humoristique !");
				Print("");
				Print("Crée par Gurvv29 et MrDragonn.");
				Print("Version: "+ ver + " .");
				Print("");
				Print("Merci d'avoir lu !");
				Print("");
				Print("->  Pressez une touche pour continuer");
				sc.next();
					try {
						start();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
			}

		private static void Print(String string) {
			System.out.println(string);
			
		}

	}
