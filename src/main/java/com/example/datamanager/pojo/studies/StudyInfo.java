package com.example.datamanager.pojo.studies;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudyInfo {

	String			patientName;
	String			studyDescription;
	String			patientId;
	String			studyIUId;
	Date			studyDate;
	List<Modality>	modalities;
	Date			timeOfAddition;
}
