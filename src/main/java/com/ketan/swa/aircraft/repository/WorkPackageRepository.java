package com.ketan.swa.aircraft.repository;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WorkPackageRepository {

    @Id
    private final Long id;

    private final String taskCode;
    private final String taskName;

    public WorkPackageRepository(Long id, String taskCode, String taskName) {
        this.id = id;
        this.taskCode = taskCode;
        this.taskName = taskName;
    }

    public Long getId() {
        return id;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public String getTaskName() {
        return taskName;
    }
}
