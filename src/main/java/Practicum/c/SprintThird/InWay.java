package Practicum.c.SprintThird;

abstract class Item {
    // ваш код здесь
    protected String name;

    public Item(String name) {
        this.name = name;
    }
    abstract float getWeight();
    abstract float getSize();
    @Override
    public String toString() {
        return name;
    }
}

class Bottle extends Item {
    // ваш код здесь
    float value;


    public Bottle(String name, float value) {
        super(name);
        this.value = value;

    }

    @Override
    float getWeight() {
        return value;
    }

    @Override
    float getSize() {
        return value;
    }

}

class Clothes extends Item {
    // ваш код здесь
    float weight;
    float size;

    public Clothes(String name, float weight, float size) {
        super(name);
        this.weight = weight;
        this.size = size;
    }

    @Override
    float getWeight() {
        return weight;
    }

    @Override
    float getSize() {
        return size;
    }
}

class Electronic extends Item {
    // ваш код здесь
    float size;

    public Electronic(String name, float size) {
        super(name);
        this.size = size;
    }

    @Override
    float getWeight() {
        return size/2;
    }

    @Override
    float getSize() {
        return size;
    }
}

class SmallThings extends Item {
    // ваш код здесь

    public SmallThings(String name) {
        super(name);
    }

    @Override
    float getWeight() {
        return 0;
    }

    @Override
    float getSize() {
        return 0.5F;
    }
}
