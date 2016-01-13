create table bbmrieric.biobank (
	biobankId LONG not null primary key,
	organisationid LONG,
	ldapbiobankID TEXT null,
	biobankcountry TEXT null,
	biobankname TEXT null,
	biobanktype TEXT null,
	biobanksize TEXT null,
	biobankdescription VARCHAR(75) null,
	biobankjuristicperson TEXT null,
	UUID VARCHAR(75) null
);

create table bbmrieric.contactinformation (
	uuid_ VARCHAR(75) null,
	contactinformationId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	updateuuid VARCHAR(75) null,
	contactID VARCHAR(75) null,
	contactEmail VARCHAR(75) null,
	contactCountry VARCHAR(75) null,
	contactFirstName VARCHAR(75) null,
	contactLastName VARCHAR(75) null,
	contactPhone VARCHAR(75) null,
	contactAddress TEXT null,
	contactZIP VARCHAR(75) null,
	contactCity VARCHAR(75) null
);

create table bbmrieric.d2biobank (
	uuid_ VARCHAR(75) null,
	biobankId LONG not null primary key,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	updateuuid VARCHAR(75) null,
	contactIDRef VARCHAR(75) null,
	contactPriority LONG,
	bbmribiobankID VARCHAR(75) null,
	biobankName TEXT null,
	biobankJurisdicalPerson TEXT null,
	biobankCountry VARCHAR(75) null,
	biobankPartnerCharterSigned BOOLEAN,
	bioresourceReference VARCHAR(75) null,
	biobankNetworkIDRef VARCHAR(75) null,
	geoLatitude VARCHAR(75) null,
	geoLongitude VARCHAR(75) null,
	collaborationPartnersCommercial BOOLEAN,
	collaborationPartnersNonforprofit BOOLEAN,
	biobankITSupportAvailable BOOLEAN,
	biobankITStaffSize LONG,
	biobankISAvailable BOOLEAN,
	biobankHISAvailable BOOLEAN,
	biobankAcronym VARCHAR(75) null,
	biobankDescription TEXT null,
	biobankURL VARCHAR(500) null,
	biobankHeadFirstName VARCHAR(75) null,
	biobankHeadLastName VARCHAR(75) null,
	biobankHeadRole VARCHAR(75) null,
	biobankClinical BOOLEAN,
	biobankPopulation BOOLEAN,
	biobankResearchStudy BOOLEAN,
	biobankNonHuman BOOLEAN,
	biobankCollection BOOLEAN,
	biobankType VARCHAR(75) null
);

create table bbmrieric.d2biobanknetwork (
	uuid_ VARCHAR(75) null,
	d2biobanknetworkId LONG not null primary key,
	parentd2biobanknetworkId LONG,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	updateuuid VARCHAR(75) null,
	contactIDRef VARCHAR(75) null,
	contactPriority LONG,
	bbmriBiobankNetworkID VARCHAR(75) null,
	biobankNetworkName TEXT null,
	biobankNetworkCommonCollectionFocus BOOLEAN,
	biobankNetworkCommonCharter BOOLEAN,
	biobankNetworkCommonSOPs BOOLEAN,
	biobankNetworkCommonDataAccessPolicy BOOLEAN,
	biobankNetworkCommonSampleAccessPolicy BOOLEAN,
	biobankNetworkCommonMTA BOOLEAN,
	biobankNetworkCommonRepresentation BOOLEAN,
	biobankNetworkCommonURL BOOLEAN,
	biobankNetworkIDRef VARCHAR(75) null,
	geoLatitude VARCHAR(75) null,
	geoLongitude VARCHAR(75) null,
	biobankNetworkAcronym VARCHAR(75) null,
	biobankNetworkDescription TEXT null,
	biobankNetworkURL TEXT null,
	biobankNetworkJuridicalPerson TEXT null
);

create table bbmrieric.d2biobanknetworklink (
	uuid_ VARCHAR(75) null,
	d2biobanknetworklinkId LONG not null primary key,
	d2biobanknetworkId LONG,
	d2linkId LONG,
	d2linktype VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	updateuuid VARCHAR(75) null
);

create table bbmrieric.d2collection (
	uuid_ VARCHAR(75) null,
	d2collectionId LONG not null primary key,
	biobankId LONG,
	parentd2collectionId LONG,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	updateuuid VARCHAR(75) null,
	bbmricollectionID VARCHAR(75) null,
	bbmriparentcollectionID VARCHAR(75) null,
	bbmribiobankID VARCHAR(75) null,
	collectionName TEXT null,
	materialStoredDNA BOOLEAN,
	materialStoredPlasma BOOLEAN,
	materialStoredSerum BOOLEAN,
	materialStoredUrine BOOLEAN,
	materialStoredSaliva BOOLEAN,
	materialStoredFaeces BOOLEAN,
	materialStoredRNA BOOLEAN,
	materialStoredBlood BOOLEAN,
	materialStoredTissueFrozen BOOLEAN,
	materialStoredTissueFFPE BOOLEAN,
	materialStoredImmortalizedCellLines BOOLEAN,
	materialStoredIsolatedPathogen BOOLEAN,
	materialStoredOther VARCHAR(75) null,
	collectionTypeCaseControl BOOLEAN,
	collectionTypeCohort BOOLEAN,
	collectionTypeCrossSectional BOOLEAN,
	collectionTypeLongitudinal BOOLEAN,
	collectionTypeTwinStudy BOOLEAN,
	collectionTypeQualityControl BOOLEAN,
	collectionTypePopulationBased BOOLEAN,
	collectionTypeDiseaseSpecific BOOLEAN,
	collectionTypeBirthCohort BOOLEAN,
	collectionTypeOther VARCHAR(75) null,
	collectionOrderOfMagnitude LONG,
	bioresourceReference VARCHAR(75) null,
	contactIDRef VARCHAR(75) null,
	contactPriority LONG,
	biobankNetworkIDRef VARCHAR(75) null,
	geoLatitude VARCHAR(75) null,
	geoLongitude VARCHAR(75) null,
	collaborationPartnersCommercial BOOLEAN,
	collaborationPartnersNonforprofit BOOLEAN,
	collectionAcronym VARCHAR(75) null,
	collectionDescription TEXT null,
	collectionSexMale BOOLEAN,
	collectionSexFemale BOOLEAN,
	collectionSexUnknown BOOLEAN,
	collectionSexUndiferrentiated BOOLEAN,
	collectionAgeLow LONG,
	collectionAgeHigh LONG,
	collectionAgeUnit VARCHAR(75) null,
	collectionAvailableBiologicalSamples BOOLEAN,
	collectionAvailableSurveyData BOOLEAN,
	collectionAvailableImagingData BOOLEAN,
	collectionAvailableMedicalRecords BOOLEAN,
	collectionAvailableNationalRegistries BOOLEAN,
	collectionAvailableGenealogicalRecords BOOLEAN,
	collectionAvailablePhysioBiochemMeasurements BOOLEAN,
	collectionAvailableOther VARCHAR(75) null,
	temperatureRoom BOOLEAN,
	temperature2to10 BOOLEAN,
	temperature18to35 BOOLEAN,
	temperature60to85 BOOLEAN,
	temperatureLN BOOLEAN,
	temperatureOther VARCHAR(75) null,
	diagnosisAvailable TEXT null,
	collectionHeadFirstName VARCHAR(75) null,
	collectionHeadLastName VARCHAR(75) null,
	collectionHeadRole VARCHAR(75) null,
	collectionSampleAccessFee BOOLEAN,
	collectionSampleAccessJointProjects BOOLEAN,
	collectionSampleAccessDescription TEXT null,
	collectionSampleAccessURI TEXT null,
	collectionDataAccessFee BOOLEAN,
	collectionDataAccessJointProjects BOOLEAN,
	collectionDataAccessDescription TEXT null,
	collectionDataAccessURI TEXT null,
	collectionSize LONG,
	collectionSizeTimestamp LONG
);

create table bbmrieric.diseasediscription (
	diseasediscriptionId LONG not null primary key,
	diseasecode VARCHAR(75) null,
	diseasegroup VARCHAR(75) null,
	diseasediscription TEXT null,
	root BOOLEAN
);

create table bbmrieric.searchindex (
	searchid LONG not null primary key,
	organisationid LONG,
	locationid LONG,
	location TEXT null,
	searchindexkey TEXT null,
	searchindexvalue TEXT null,
	UUID VARCHAR(75) null
);