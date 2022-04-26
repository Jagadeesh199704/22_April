package collection_frame_work;

import java.util.Objects;

public class Gpay {
    private int id;
    private String name;
    private String date;
    private int amount;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gpay)) return false;
        Gpay gpay = (Gpay) o;
        return id == gpay.id && amount == gpay.amount && name.equals(gpay.name) && date.equals(gpay.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, amount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Gpay{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }
}
