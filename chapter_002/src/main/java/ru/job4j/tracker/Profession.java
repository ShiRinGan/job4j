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
            private String language;
            private String level;

            public String getLanguage() {
                return language;
            }

            public String getLevel() {
                return level;
            }
        }

        public class Builder extends Engineer {
            private String desing;
            private String experience;

            public String getDesing() {
                return desing;
            }

            public String getExperience() {
                return experience;
            }
        }
    }

    public class Doctor extends Profession {
        public class Surgeon extends Doctor {
            private String pain;
            private String organ;

            public String getPain() {
                return pain;
            }

            public String getOrgan() {
                return organ;
            }

        }

        public class Dentist extends Doctor {
            private String teeth;
            private String drug;

            public String getTeeth() {
                return teeth;
            }

            public String getDrug() {
                return drug;
            }

        }
    }
}
