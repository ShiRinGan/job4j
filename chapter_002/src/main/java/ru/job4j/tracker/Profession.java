package ru.job4j.tracker;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public class Engineer extends Profession {
        public class Programmer extends Engineer {
        }

        public class Builder extends Engineer {
        }
    }

    public class Doctor extends Profession {
        public class Surgeon extends Doctor {
        }

        public class Dentist extends Doctor {
        }
    }
}
