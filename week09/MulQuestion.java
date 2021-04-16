public class MulQuestion extends Question {
    
    public String display() {
        String question = String.format("%d * %d = ?", mValue1, mValue2);
        return question;
    }

    public int answer() {
        return mValue1 * mValue2;
    }
}
