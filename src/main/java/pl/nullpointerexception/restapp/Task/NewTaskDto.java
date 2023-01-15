package pl.nullpointerexception.restapp.Task;

import java.util.Date;

public class NewTaskDto {

    private Long id;

    private String name;
    private int creator;
    private Date date;
    private Date endingDate;
    private int maxPoint;

    public NewTaskDto() {
    }

    public NewTaskDto(String name, int creator, Date date, Date endingDate, int maxPoint) {
        this.name = name;
        this.creator = creator;
        this.date = date;
        this.endingDate = endingDate;
        this.maxPoint = maxPoint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public int getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(int maxPoint) {
        this.maxPoint = maxPoint;
    }

}
