public class Person {
    private int age;

	public Person(int initialAge) {
        if(initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
	}

	public void amIOld() {
        String ans;

        if(age < 13) ans = "You are young.";
        else if(age >= 13 && age < 18) ans = "You are a teenager.";
        else ans = "You are old.";

        System.out.println(ans);
	}

	public void yearPasses() {
        this.age++;
	}
