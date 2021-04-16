public class AddQuestion extends Question {
    public AddQuestion() {
        // automatically calls empty base class constructor
    }
    
    public String display() {
        String question = String.format("%d + %d = ?", mValue1, mValue2);
        return question;
    }

    public int answer() {
        return mValue1 + mValue2;
    }

}
