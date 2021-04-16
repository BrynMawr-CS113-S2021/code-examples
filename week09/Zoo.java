public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.locomote();

        Bird bird = new Bird();
        bird.eat();
        bird.locomote();
        bird.sing(); // defined only Bird
    } 
}
