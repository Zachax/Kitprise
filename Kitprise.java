/*
* To Iwona my wife for her birthday 11.3.2021,
* for delight and annoyance, a small custom made adventure game.
* Since you didn't tell what you want, you got something else instead.
* Sakari Eskelinen
*/

import java.util.*;

public class Kitprise {
    public static final String CMD_INSTRUCTIONS = "o";
    public static final String CMD_NORTH = "p";
    public static final String CMD_SOUTH = "e";
    public static final String CMD_EAST = "i";
    public static final String CMD_WEST = "l";
    public static final String CMD_QUIT = "q";
    public static final String CMD_GET = "n";
    public static final String CMD_DROP = "t";
    public static final String CMD_INVENTORY = "m";
    public static final String CMD_USE = "k";
    public static final String CMD_CHEAT = "miit";

    public static final String MSG_OFFLIMITS = "Et voi jatkaa siihen suuntaan!";
    public static final String MSG_OFFLIMITS_N = "Et voi jatkaa pohjoiseen.";
    public static final String MSG_OFFLIMITS_S = "Et voi jatkaa etelään.";
    public static final String MSG_OFFLIMITS_E = "Et voi jatkaa itään.";
    public static final String MSG_OFFLIMITS_W = "Et voi jatkaa länteen.";
    public static final String MSG_ITEMSINROOM = "Huoneessa on esineet:";
    public static final String MSG_THINGSINROOM = "Huoneessa on asiat:";
    public static final String MSG_NOTHINGTODROP = "Ei ole mitään tiputettavaa!";
    public static final String MSG_NOTHINGTOGET = "Ei ole mitään poimittavaa!";
    public static final String MSG_CANTPICKTHINGS = "Asioita ei voi poimia.";
    public static final String MSG_GOODBYE = "Toivottavasti viihdyit!";
    public static final String MSG_DROP = "Tiputit esineen:";
    public static final String MSG_GET = "Poimit esineen:";
    public static final String MSG_CARRYING = "Kannat mukanasi:";
    public static final String MSG_NOITEMS = "Suu säkkiä myöten - taskusi ovat tyhjät!";
    public static final String MSG_CANTUSEANYTHING = "Täällä - tai sinulla - ei ole mitään käytettävää!";
    public static final String MSG_WHATTOUSE = "Voit käyttää jotain seuraavista:";
    public static final String MSG_ERRORNOTNUMBER = "Taisi tulla näppäilyvirhe - piti saada numero.";
    public static final String MSG_ERRORNUMBERNOMATCH = "Ei tuollaista käytettävää ole täällä.";
    public static final String MSG_USING = "Koetat käyttää:";
    public static final String MSG_HAPPYBIRTHDAY = "Hyvää syntymäpäivää!";
    public static final String MSG_DONTKNOWHOWTOUSE = "Et keksi, kuinka käyttää:";
    public static final String MSG_IFMEANTTOUSEPOCKETITEM = "on taskussasi - jos halusit käyttää tätä siihen, laske se ensin maahan.";
    public static final String MSG_YOUGOTTHIS = "Sait jotain uutta:";
    public static final String MSG_FINALTHING = "Paina enteriä jatkaaksesi...";
    public static final String MSG_FOODWAS = "Ateriasi taisi olla";

    public static final String ITM_EGG = "Yllätysmuna";
    public static final String ITM_HAMMER = "Vasara";
    public static final String ITM_MIIT = "Miit";
    public static final String ITM_FLOWER = "Kukkanen";
    public static final String ITM_FOOD = "Sapuskaa";

    public static final String THG_ALTAR = "Alttari";
    public static final String THG_COMPUTER = "Retrotietokone";
    public static final String THG_AIRFRYER = "Kiertoilmakypsennin";

    public static final String EFF_BROKENEGG = ITM_EGG + " hajoaa!";
    public static final String EFF_USEEGG = ITM_EGG + "n sisällä on jotain, mutta sen kuori on kova kuin kookoksella.";
    public static final String EFF_HAMMERCOMPUTER = "Vaikka kovasti mielisit, et tohdi takoa vasaralla " + THG_COMPUTER + "tta.";
    public static final String EFF_USECOMPUTER = "Tietokoneella olisi varmasti jotain annettavaa... Valitettavasti et hallitse BASIC-kieltä.";
    public static final String EFF_USEALTAR = "Et osaa palvoa tyhjää alttaria. Siihen näyttää sopivan jotain pyöreää.";
    public static final String EFF_HAMMERALTAR = "Lyöt vasaralla alasinta, joka kilahtaa kumeasti! Se muistuttaa alasinta.";
    public static final String EFF_HAMMER = "Huidot vasaraa ilmassa. Sen pää on raskas. Tällä voisi rikkoa jotain.";
    public static final String EFF_MIITCOMPUTER = "Miit kirjoittaa tietokoneelle pari riviä käsittämätöntä koodia...\nJotain sellaista kuin 10 PRINT\"" + MSG_HAPPYBIRTHDAY + "\";:GOTO 10. \nMitä ihmettä, nyt kone tulostaa koko ajan synttärionnitteluja - yksin sinulle!\nOnneksi olkoon, voitit pelin!";
    public static final String EFF_USEMIIT = "Miit on lihaisa ja haluaisit syödä hänet. Mutta tämä vain höpöttää jotain vanhoista tietokoneista. Kuinka pitkäveteistä!";
    public static final String EFF_SLIDINGEGG = "Yrität lyödä munaa vasaralla, mutta alusta on kelvoton - muna vain joko uppoaa maahan tai luiskahtaa toisaalle.";
    public static final String EFF_USEFLOWER = "Haista kukkanen!\nLuulet, että tämä on täällä vain koristeeksi ja iloksesi.";
    public static final String EFF_USEFRYER = "Valmistat ruokaa kieroilmalla käristämällä. Nam nam!";
    public static final String EFF_EATFOOD = "Herkuttelet kokkauksellasi. Olipa se hyvää!";

    public static final String[] ADJECTIVES = {
        "haiseva", "punainen", "ruokaisa", "oksettava", "pelottava", "hämmentävä", "kaunis", "tavallinen", "epäilyttävä", "miellyttävä", "tyylikäs", "oivallinen", "pimeä", "valoisa", "kostea", "hiostava", "kylmä"
    };

    public static final String[] PLACES = {
        "huone", "käytävä", "kammio", "paikka", "aukio", "koppi", "oleskelupaikka", "työhuone", "makuuhuone", "olohuone", "sisäpiha", "tunneli", "silta", "porttikonki", "akvaario"
    };

    public static final String[] FOODS = {
        "pinaattilettuja", "makaronilaatikkoa", "kabanosya", "pirogeja", "perunaherkkua", "nakkikeittoa", "voileipäkeksejä", "sämpylöitä", "paahtoleipää majoneesilla", "suolattua salaattia", "lempiruokaasi", "sinapilla maustettuja vihanneksia"
    };

    /*
    * 0 = What is used
    * 1 = To what is used (null if no matter)
    * 2 = This needs to be around (null if no matter)
    * 3 = This happens
    * 4 = This is gotten (null if nothing)
    * Order here is important - the first matching use case is taken...
    */
    public static final String[][] USE_EFFECTS = {
        { ITM_HAMMER, ITM_EGG, THG_ALTAR, EFF_BROKENEGG, ITM_MIIT },
        { ITM_HAMMER, ITM_EGG, null, EFF_SLIDINGEGG, null },
        { ITM_EGG, ITM_EGG, null, EFF_USEEGG, null },
        { ITM_HAMMER, null, THG_COMPUTER, EFF_HAMMERCOMPUTER, null },
        { THG_COMPUTER, null, THG_COMPUTER, EFF_USECOMPUTER, null },
        { THG_ALTAR, null, THG_ALTAR, EFF_USEALTAR, null },
        { ITM_HAMMER, THG_ALTAR, THG_ALTAR, EFF_HAMMERALTAR, null },
        { ITM_HAMMER, null, null, EFF_HAMMER, null },
        { ITM_MIIT, THG_COMPUTER, THG_COMPUTER, EFF_MIITCOMPUTER, null },
        { ITM_MIIT, null, null, EFF_USEMIIT, null },
        { ITM_FLOWER, null, null, EFF_USEFLOWER, null },
        { THG_AIRFRYER, null, THG_AIRFRYER, EFF_USEFRYER, ITM_FOOD},
        { ITM_FOOD, null, null, EFF_EATFOOD, null},
    };

    public static final int minX = 0;
    public static final int maxX = 3;
    public static final int minY = 0;
    public static final int maxY = 3;

    /*
    * Here are all pickable items that are randomized by location into the game area.
    */
    public static String[] allItems = {
        ITM_EGG, ITM_HAMMER, ITM_FLOWER
    };

    /*
    * Here are all non-pickable objects that are randomized by location into the game area.
    */
    public static String[] otherThings = {
        THG_ALTAR, THG_COMPUTER, THG_AIRFRYER
    };
    public static Room[][] rooms = new Room[maxX+1][maxY+1];

    public static void init() {
        for (int i = 0; i <= maxX; i++) {
            for (int j = 0; j <= maxY; j++) {
                int rndAdj = (int) (Math.random() * ADJECTIVES.length);
                int rndPlc = (int) (Math.random() * PLACES.length);
                String description = "Tämä on " + ADJECTIVES[rndAdj] + " " + PLACES[rndPlc];
                Room room = new Room(i, j, description);
                rooms[i][j] = room;
                //System.out.println("Tein " + room + " " + i + " " + j);
            }
        }

        for (int i = 0; i < allItems.length; i++) {
            int x = (int) (Math.random() * (maxX + 1));
            int y = (int) (Math.random() * (maxY + 1));
            Item thing = new Item(allItems[i], true);
            rooms[x][y].addItem(thing);
            //System.out.println("Lisätty esine " + thing + " " + x + " " + y);
        }

        for (int i = 0; i < otherThings.length; i++) {
            int x = (int) (Math.random() * (maxX + 1));
            int y = (int) (Math.random() * (maxY + 1));
            Item thing = new Item(otherThings[i], false);
            rooms[x][y].addItem(thing);
            //System.out.println("Lisätty asia " + thing + " " + x + " " + y);
        }
        System.out.println("Peli alustettu.");
    }

    public static boolean itemListHas(String a, ArrayList<Item> items) {
        for (Item b : items) {
            if (b.name.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public static void removeItemFromList(String x, ArrayList<Item> list) {
        for (Item thing : list) {
            if (thing.name.equals(x)) {
                list.remove(thing);
                break;
            }
        }
    }

    // This is a cheat to show item locations
    public static void showItemLocations() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                for (Item thing : rooms[i][j].items) {
                    System.out.println(thing.name + " " + i + ":" + j);
                }
            }
        }
    }

    public static void getSituation(int[] loc) {
        Room thisRoom = rooms[loc[0]][loc[1]];
        System.out.println(thisRoom);
        System.out.println("Sijaintisi on X: " + loc[0] + " Y: " + loc[1]);
        if (loc[0] - 1 < minX) {
            System.out.println(MSG_OFFLIMITS_W);
        }
        if (loc[0] + 1 > maxX) {
            System.out.println(MSG_OFFLIMITS_E);
        }
        if (loc[1] - 1 < minY) {
            System.out.println(MSG_OFFLIMITS_S);
        }
        if (loc[1] + 1 > maxY) {
            System.out.println(MSG_OFFLIMITS_N);
        }

        int itms = thisRoom.items.size();
        if (itms > 0) {
            boolean noItemFound = true;
            boolean noThingFound = true;
            for (int i = 0; i < itms; i++) {
                 Item thing = thisRoom.items.get(i);
                 if (thing.pickable()) {
                     if (noItemFound) {
                         System.out.print(MSG_ITEMSINROOM);
                         noItemFound = false;
                     }
                     System.out.print(" " + thing);
                 }
            }
            if (!noItemFound) {
                System.out.println();
            }
            for (int i = 0; i < itms; i++) {
                 Item thing = thisRoom.items.get(i);
                 if (!thing.pickable()) {
                     if (noThingFound) {
                         System.out.print(MSG_THINGSINROOM);
                         noThingFound = false;
                     }
                     System.out.print(" " + thing);
                 }
            }
            if (!noThingFound) {
                System.out.println();
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Tässä on komennot:");
        System.out.println(CMD_INSTRUCTIONS + " = ohje (tämä teksti)");
        System.out.println(CMD_NORTH + " = liiku pohjoiseen");
        System.out.println(CMD_SOUTH + " = liiku etelään");
        System.out.println(CMD_EAST + " = liiku itään");
        System.out.println(CMD_WEST + " = liiku länteen");
        System.out.println(CMD_QUIT + " = lopeta peli");
        System.out.println(CMD_GET + " = poimi (nosta) esine (listan ensimmäinen)");
        System.out.println(CMD_DROP + " = tiputa esine");
        System.out.println(CMD_INVENTORY + " = mukanasi olevat tavarat");
        System.out.println(CMD_USE + " = käytä esinettä");
    }

    public static void moveDirection(String command, int[] loc) {
        if(command.equals(CMD_NORTH)) {
            if ((loc[1] + 1) <= maxY) {
                loc[1]++;
            } else {
                System.out.println(MSG_OFFLIMITS);
            }
        } else if(command.equals(CMD_SOUTH)) {
            if ((loc[1] - 1) >= minY) {
                loc[1]--;
            } else {
                System.out.println(MSG_OFFLIMITS);
            }
        } else if(command.equals(CMD_EAST)) {
            if ((loc[0] + 1) <= maxX) {
                loc[0]++;
            } else {
                System.out.println(MSG_OFFLIMITS);
            }
        } else if(command.equals(CMD_WEST)) {
            if ((loc[0] - 1) >= minX) {
                loc[0]--;
            } else {
                System.out.println(MSG_OFFLIMITS);
            }
        }
    }

    public static void dropItem(Room daRuum, ArrayList<Item> pockets) {
        if (pockets.size() > 0) {
            int lastItem = pockets.size() - 1;
            Item daThing = pockets.remove(lastItem);
            daRuum.addItem(daThing);
            System.out.println(MSG_DROP + " " + daThing);
        } else {
            System.out.println(MSG_NOTHINGTODROP);
        }
    }

    public static void getItem(Room daRuum, ArrayList<Item> pockets) {
        if (daRuum.items.size() > 0) {
            boolean picked = false;
            int lastItem = daRuum.items.size() - 1;
            while (!picked && lastItem >= 0) {
                Item daThing = daRuum.items.get(lastItem);
                if (daThing.pickable()) {
                    picked = true;
                    daRuum.removeItem(daThing);
                    pockets.add(daThing);
                    System.out.println(MSG_GET + " " + daThing);
                } else {
                    lastItem--;
                }
            }
            if (!picked) {
                System.out.println(MSG_CANTPICKTHINGS);
            }
        } else {
            System.out.println(MSG_NOTHINGTOGET);
        }
    }

    public static void inventory(ArrayList<Item> pockets) {
        if (!pockets.isEmpty()) {
            System.out.println(MSG_CARRYING);
            for (Item thing : pockets) {
                System.out.print(thing + " ");
            }
            System.out.println();
        } else {
            System.out.println(MSG_NOITEMS);
        }
    }

    public static void useItem(ArrayList<Item> pockets, Room daRuum) {
        if (pockets.isEmpty() && daRuum.items.isEmpty()) {
            System.out.println(MSG_CANTUSEANYTHING);
        } else {
            System.out.println(MSG_WHATTOUSE);
            for (int i = 0; i < pockets.size() + daRuum.items.size(); i++) {
                Item thing = null;
                if (i < pockets.size()) {
                    thing = pockets.get(i);
                } else {
                    thing = daRuum.items.get(i - pockets.size());
                }
                System.out.println(i + " - " + thing);
            }

            Scanner itemInput = new Scanner(System.in);
            try {
                int itemidx = itemInput.nextInt();
                Item thing = null;
                if (itemidx < pockets.size()) {
                    thing = pockets.get(itemidx);
                } else {
                    thing = daRuum.items.get(itemidx - pockets.size());
                }
                System.out.println(MSG_USING + " " + thing);
                thing.use(pockets, daRuum);
            } catch (InputMismatchException e) {
                System.out.println(MSG_ERRORNOTNUMBER);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(MSG_ERRORNUMBERNOMATCH);
                //e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void handleCommand(String command, int[] loc, ArrayList<Item> pockets) {
        Room daRuum = rooms[loc[0]][loc[1]];
        command = command.toLowerCase();
        if (command.equals(CMD_INSTRUCTIONS)) {
            printInstructions();
        } else if(command.equals(CMD_NORTH) || command.equals(CMD_SOUTH) || command.equals(CMD_EAST) || command.equals(CMD_WEST)) {
            moveDirection(command, loc);
        } else if(command.equals(CMD_GET)) {
            getItem(daRuum, pockets);
        } else if(command.equals(CMD_DROP)) {
            dropItem(daRuum, pockets);
        } else if (command.equals(CMD_INVENTORY)) {
            inventory(pockets);
        } else if (command.equals(CMD_USE)) {
            useItem(pockets, daRuum);
        } else if(command.equals(CMD_QUIT)) {
            exitGame();
        } else if (command.equals(CMD_CHEAT)) {
            showItemLocations();
        } else {
            System.out.println("En ymmärrä! (" + CMD_INSTRUCTIONS + " = ohje)");
        }
    }

    public static void exitGame() {
        System.out.println(MSG_GOODBYE);
        System.exit(0);
    }

    public static void checkSpecialEffect(String a, ArrayList<Item> pockets, Room daRuum) {
        if (a.equals(EFF_MIITCOMPUTER)) {
            Scanner stop = new Scanner(System.in);
            System.out.println(MSG_FINALTHING);
            stop.nextLine();
            for (int i = 0; i < 10000; i++) {
                System.out.print(MSG_HAPPYBIRTHDAY + " ");
            }
            System.out.println();
            exitGame();
        } else if (a.equals(EFF_BROKENEGG)) {
            removeItemFromList(ITM_EGG, pockets);
            daRuum.removeItem(ITM_EGG);
        } else if (a.equals(EFF_EATFOOD)) {
            int indx = (int) (Math.random() * FOODS.length);
            System.out.print(MSG_FOODWAS + " " + FOODS[indx] + ".");
            System.out.println();
            removeItemFromList(ITM_FOOD, pockets);
            daRuum.removeItem(ITM_FOOD);
        }
    }

    public static void main(String args[]) {
        boolean gameRunning = true;
        int[] location = new int[2];
        ArrayList<Item> pockets = new ArrayList<>();
        init();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tervetuloa, Iwona! Tämä peli on tehty ihan sinua varten.");
        while(gameRunning) {
            getSituation(location);
            System.out.println("Mitäs nyt?");
            String command = keyboard.nextLine();
            handleCommand(command, location, pockets);
        }
    }
}

class Room {
    int x;
    int y;
    String description;
    ArrayList<Item> items;
    public Room(int x, int y, String description) {
        this.x = x;
        this.y = y;
        this.description = description;
        items = new ArrayList<>();
    }

    public void addItem(Item x) {
        items.add(x);
    }

    public void removeItem(Item x) {
        items.remove(x);
    }

    public void removeItem(String x) {
        Kitprise.removeItemFromList(x, this.items);
    }

    public boolean roomHas(Item a) {
        for (Item b : items) {
            if (b.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public boolean roomHas(String a) {
        for (Item b : items) {
            if (b.name.equals(a)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return description;
    }
}

class Item {
    String name;
    boolean pickable;

    public Item(String name, boolean pickable) {
        this.name = name;
        this.pickable = pickable;
    }

    public boolean pickable() {
        return pickable;
    }

    public void use(ArrayList<Item> pockets, Room daRuum) {
        boolean itemFound = false;
        for (int i = 0; i < Kitprise.USE_EFFECTS.length ; i++) {
            if (Kitprise.USE_EFFECTS[i][0].equals(this.name)) {
                boolean canProceed = true;
                if (Kitprise.USE_EFFECTS[i][1] != null) {
                    if (!daRuum.roomHas(Kitprise.USE_EFFECTS[i][1])) {
                        canProceed = false;
                    }
                    if (Kitprise.itemListHas(Kitprise.USE_EFFECTS[i][1], pockets)) {
                        System.out.println(Kitprise.USE_EFFECTS[i][1] + " " + Kitprise.MSG_IFMEANTTOUSEPOCKETITEM);
                    }
                }
                if (canProceed && Kitprise.USE_EFFECTS[i][2] != null) {
                    if (!daRuum.roomHas(Kitprise.USE_EFFECTS[i][2])) {
                        canProceed = false;
                    }
                }
                // This is where the actual use act happens.
                if (canProceed && Kitprise.USE_EFFECTS[i][3] != null) {
                    System.out.println(Kitprise.USE_EFFECTS[i][3]);
                    Kitprise.checkSpecialEffect(Kitprise.USE_EFFECTS[i][3], pockets, daRuum);
                }
                // Actions valid here will produce a new item.
                if (canProceed && Kitprise.USE_EFFECTS[i][4] != null) {
                    Item gotten = new Item(Kitprise.USE_EFFECTS[i][4], true);
                    pockets.add(gotten);
                    System.out.println(Kitprise.MSG_YOUGOTTHIS + " " + gotten);
                }
                if (canProceed) {
                    itemFound = true;
                    break;
                }
            } else {
                continue;
            }
        }

        if (!itemFound) {
            System.out.println(Kitprise.MSG_DONTKNOWHOWTOUSE + this.name);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
