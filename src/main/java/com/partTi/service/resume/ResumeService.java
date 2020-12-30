package com.partTi.service.resume;

import com.partTi.pojo.resume.Resume;
import com.partTi.utils.ResponseDate;

public interface ResumeService {

    ResponseDate getResumeByAny(Resume resume,Integer index,Integer pageSize,String sort);

    ResponseDate countResume(Resume resume,String sort);

    ResponseDate getResumeById(Integer id);

    ResponseDate insertResume(Resume resume);

    ResponseDate updateResume(Resume resume);

    ResponseDate deleteResume(Integer id);
}
