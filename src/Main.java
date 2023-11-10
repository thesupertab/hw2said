interface Printable {
    void print();
}

class Parent implements Printable {
    private String parentProperty;

    public Parent(String parentProperty) {
        this.parentProperty = parentProperty;
    }

    public String getParentProperty() {
        return parentProperty;
    }

    public void setParentProperty(String parentProperty) {
        this.parentProperty = parentProperty;
    }

    @Override
    public void print() {
        System.out.println("Parent property: " + parentProperty);
    }
}

class IPhone2 implements Printable {
    private String iPhone2Property;

    public IPhone2(String parentProperty, String iPhone2Property) {
        // Изменим конструктор, чтобы он принимал parentProperty от родительского класса
        super();
        this.iPhone2Property = iPhone2Property;
    }

    public String getIPhone2Property() {
        return iPhone2Property;
    }

    public void setIPhone2Property(String iPhone2Property) {
        this.iPhone2Property = iPhone2Property;
    }

    @Override
    public void print() {
        super.getClass();
        System.out.println("iPhone2 property: " + iPhone2Property);
    }
}

class IPhone3 implements Printable {
    private int iPhone3Property;

    public IPhone3(int iPhone3Property) {
        this.iPhone3Property = iPhone3Property;
    }

    public int getIPhone3Property() {
        return iPhone3Property;
    }

    public void setIPhone3Property(int iPhone3Property) {
        this.iPhone3Property = iPhone3Property;
    }

    @Override
    public void print() {
        System.out.println("iPhone3 property: " + iPhone3Property);
    }
}

class IPhone4 implements Printable {
    private double iPhone4Property;

    public IPhone4(double iPhone4Property) {
        this.iPhone4Property = iPhone4Property;
    }

    public double getIPhone4Property() {
        return iPhone4Property;
    }

    public void setIPhone4Property(double iPhone4Property) {
        this.iPhone4Property = iPhone4Property;
    }

    @Override
    public void print() {
        System.out.println("iPhone4 property: " + iPhone4Property);
    }
}

public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];

        objects[0] = createObject("iPhone2");
        objects[1] = createObject("iPhone3");
        objects[2] = createObject("iPhone4");

        for (Printable obj : objects) {
            obj.print();
            System.out.println(); // Добавляем пустую строку для разделения информации об объектах
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "iPhone2":
                return new IPhone2("Parent Property 1", "iPhone2 Property 1");
            case "iPhone3":
                return new IPhone3(42);
            case "iPhone4":
                return new IPhone4(3.14);
            default:
                throw new IllegalArgumentException("Invalid class name");
        }
    }
}