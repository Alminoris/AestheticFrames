package net.alminoris.aestheticframes.util.helper;

public class ModJsonTemplates
{
    public static String SHAPED_RECIPE = """
            {
              "type": "minecraft:crafting_shaped",
              "pattern": [
                PATTERN1
                PATTERN2
                PATTERN3
              ],
              "key": {
                "#": {
                  "item": "INGREDIENT_NAME"
                },
                "/": {
                  "item": "LOG_NAME"
                }
              },
              "result": {
                "count": COUNT,
                "item": "aestheticframes:OUTPUT_NAME"
              }
            }
            """;
}