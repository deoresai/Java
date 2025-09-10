
class continent {

    String conti;

    continent(String conti) {
        this.conti = conti;
    }

    void display() {
        System.out.println("continent: " + conti);
    }
}

class country extends continent {

    String count;

    country(String count, String conti) {
        super(conti);
        this.count = count;

    }

    void display() {
        System.out.println("country: " + count);
        super.display();
    }
}

class place extends country {

    String place, state;

    place(String place, String count, String conti, String state) {
        super(count, conti);
        this.place = place;
        this.state = state;
    }

    void display() {
        System.out.println("place: " + place);
        System.out.println("state: " + state);
        super.display();
    }
}

class countryDemo {

    public static void main(String[] args) {
        place p = new place("Deola", "India", "asia", "Maharashtra");
        p.display();
    }
}
