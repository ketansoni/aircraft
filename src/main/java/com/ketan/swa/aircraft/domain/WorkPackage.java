package com.ketan.swa.aircraft.domain;

import javax.annotation.Resource;

public class WorkPackage {

//    @Resource
//    WorkPackageRepository workPackageRepository;

    private final Long id;
    private final String taskCode;
    private final String taskName;

    public WorkPackage(Long id, String taskCode, String taskName) {
        this.id = id;
        this.taskCode = taskCode;
        this.taskName = taskName;
    }


}

