package yoon.JSONDTO;

import java.util.List;
import java.util.Objects;

public class AuthorDtoClass {

    private String name;
    private String birthDay;
    private List<String> ListOfWorks;

    public AuthorDtoClass(String name, String birthDay, List<String> listOfWorks) {
        this.name = name;
        this.birthDay = birthDay;
        ListOfWorks = listOfWorks;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public List<String> getListOfWorks() {
        return ListOfWorks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorDtoClass that = (AuthorDtoClass) o;
        return Objects.equals(name, that.name) && Objects.equals(birthDay, that.birthDay) && Objects.equals(ListOfWorks, that.ListOfWorks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDay, ListOfWorks);
    }
}
