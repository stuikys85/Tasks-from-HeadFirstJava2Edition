public class phraseOMatic{
    public static void main (String[] args) {
        String[] wordListOne = {" sexy ", " smart", "clever"};
        String[] wordListTwo = {"focused", "targeted", "Quick responding"};
        String[] wordListThree = {"strategy", "Mind share", "vision"};

        // find how many words in in each list
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        // generate random numbers
        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
    }