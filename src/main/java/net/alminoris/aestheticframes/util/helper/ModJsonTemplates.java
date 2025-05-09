package net.alminoris.aestheticframes.util.helper;

public class ModJsonTemplates
{
    public static String SHAPED_RECIPE = """
            {
              "type": "minecraft:crafting_shaped",
              "category": "building",
              "key": {
                "#": {
                  "item": "INGREDIENT_NAME"
                },
                "/": {
                  "item": "LOG_NAME"
                }
              },
              "pattern": [
                PATTERN1
                PATTERN2
                PATTERN3
              ],
              "result": {
                "count": COUNT,
                "id": "aestheticframes:OUTPUT_NAME"
              }
            }
            """;
}