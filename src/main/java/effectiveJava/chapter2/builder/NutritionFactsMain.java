package effectiveJava.chapter2.builder;

public class NutritionFactsMain {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10, 20)
                .calories(30).build();

        NutritionFacts aaa = new NutritionFacts.Builder(1, 2)
                .calories(100)
                .fat(200)
                .sodium(300)
                .carbohydrate(400)
                .build();

    }
}
