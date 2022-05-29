public class Lasagna {
    private final int COOKING_TIME_IN_MINS = 40; // cooking time is 40 minutes
    private final int MINS_PREP_PER_LAYER = 2; // each layer takes 2 minutes to cook

    // Returns expected length of 40 minutes
    public int expectedMinutesInOven(){
        return COOKING_TIME_IN_MINS;
    }
    // Returns minutes remaining in oven, based on expected minutes
    public int remainingMinutesInOven(int minutesPassed){
        return this.expectedMinutesInOven() - minutesPassed;
    }
    // Returns number of minutes you have spent preparing the lasagna
    public int preparationTimeInMinutes(int numLayers){
        return MINS_PREP_PER_LAYER * numLayers;
    }
    // Returns the total time you have been making the lasagna
    public int totalTimeInMinutes(int numLayers, int minutesPassed){
        return this.preparationTimeInMinutes(numLayers) + minutesPassed;
    }
}
