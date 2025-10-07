package uj.wmii.pwj.introduction;

import java.util.HashMap;
import java.util.Map;

public class Banner {
    private final Map<Character, String[]> fontMap = new HashMap<>();

    Banner () {
        loadFont();
    }

    private void loadFont() {
        fontMap.put('A', new String[]{
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######" ,
                "#     #",
                "#     #"
        });
        fontMap.put('B', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });
        fontMap.put('C',new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });
        fontMap.put('D', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });
        fontMap.put('E', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });
        fontMap.put('F', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });
        fontMap.put('G', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });
        fontMap.put('H', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });
        fontMap.put('I', new String[]{
                "###",
                " # ",
                " # ",
                " # ",
                " # ",
                " # ",
                "###"
        });
        fontMap.put('J', new String[]{
                "      #",
                "      #",
                "      #",
                "      #",
                "#     #",
                "#     #",
                " ##### "
        });
        fontMap.put('K', new String[]{
                "#    #",
                "#   # ",
                "#  #  ",
                "###   ",
                "#  #  ",
                "#   # ",
                "#    #"
        });
        fontMap.put('L', new String[]{
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#######"
        });
        fontMap.put('M', new String[]{
                "#     #",
                "##   ##",
                "# # # #",
                "#  #  #",
                "#     #",
                "#     #",
                "#     #"
        });
        fontMap.put('N', new String[]{
                "#     #",
                "##    #",
                "# #   #",
                "#  #  #",
                "#   # #",
                "#    ##",
                "#     #"
        });
        fontMap.put('O', new String[]{
                "#######",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#######"
        });
        fontMap.put('P', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#      ",
                "#      ",
                "#      "
        });
        fontMap.put('Q', new String[]{
                " ##### ",
                "#     #",
                "#     #",
                "#     #",
                "#   # #",
                "#    # ",
                " #### #"
        });
        fontMap.put('R', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#   #  ",
                "#    # ",
                "#     #"
        });
        fontMap.put('S', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                " ##### ",
                "      #",
                "#     #",
                " ##### "
        });
        fontMap.put('T', new String[]{
                "#######",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        fontMap.put('U', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " ##### "
        });
        fontMap.put('W', new String[]{
                "#     #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                " ## ## "
        });
        fontMap.put('V', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   "
        });
        fontMap.put('X', new String[]{
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #"
        });
        fontMap.put('Y', new String[]{
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        fontMap.put('Z', new String[]{
                "#######",
                "     # ",
                "    #  ",
                "   #   ",
                "  #    ",
                " #     ",
                "#######"
        });
        fontMap.put(' ', new String[]{
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  "
        });
    }

    public String[] toBanner(String input) {
        if (input == null || input.isEmpty()) {
            return new String[0];
        }

        final int height = 7;
        String[] lines = new String[height];

        for (int i = 0; i < height; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char c = Character.toUpperCase(input.charAt(j));
                String[] letter = fontMap.getOrDefault(c, fontMap.get(' '));
                row.append(letter[i]);

                if (j < input.length() - 1) {
                    row.append(" ");
                }
            }
            lines[i] = row.toString();
        }

        return lines;
    }

}