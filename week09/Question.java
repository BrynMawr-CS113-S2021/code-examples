public class Question {
    protected int mValue1;    
    protected int mValue2;    

    public Question() {
        mValue1 = (int) (Math.random()*10 + 1);
        mValue2 = (int) (Math.random()*10 + 1);
    }

    public String display() {
        return "";
    }

    public int answer() {
        return 0;
    }
}
