package com.test1;

public class CompressionMemoryRAGRetention {
	private long memoryRetentionId;
	private long memoryRagConfigurationId;
	private String sessionId;
	private String memoryType;
	private String memoryReferenceId;
	private String memoryContent;
	private String memoryImportanceScore;
	private String memoryRelevanceScore;
	private String retentionPriority;
	private String retentionPolicy;
	private String retentionPeriod;
	private String createdTime;
	private String lastAccessedTime;
	private long accessCount;
	private String expirationTime;
	private String persistentMemory;
	private String archiveRequired;
	private String archivalLocation;

	public CompressionMemoryRAGRetention() {

	}

	public CompressionMemoryRAGRetention(long memoryRetentionId, long memoryRagConfigurationId, String sessionId,
			String memoryType, String memoryReferenceId, String memoryContent, String memoryImportanceScore,
			String memoryRelevanceScore, String retentionPriority, String retentionPolicy, String retentionPeriod,
			String createdTime, String lastAccessedTime, long accessCount, String expirationTime,
			String persistentMemory, String archiveRequired, String archivalLocation) {
		super();
		this.memoryRetentionId = memoryRetentionId;
		this.memoryRagConfigurationId = memoryRagConfigurationId;
		this.sessionId = sessionId;
		this.memoryType = memoryType;
		this.memoryReferenceId = memoryReferenceId;
		this.memoryContent = memoryContent;
		this.memoryImportanceScore = memoryImportanceScore;
		this.memoryRelevanceScore = memoryRelevanceScore;
		this.retentionPriority = retentionPriority;
		this.retentionPolicy = retentionPolicy;
		this.retentionPeriod = retentionPeriod;
		this.createdTime = createdTime;
		this.lastAccessedTime = lastAccessedTime;
		this.accessCount = accessCount;
		this.expirationTime = expirationTime;
		this.persistentMemory = persistentMemory;
		this.archiveRequired = archiveRequired;
		this.archivalLocation = archivalLocation;
	}

	public long getMemoryRetentionId() {
		return memoryRetentionId;
	}

	public void setMemoryRetentionId(long memoryRetentionId) {
		this.memoryRetentionId = memoryRetentionId;
	}

	public long getMemoryRagConfigurationId() {
		return memoryRagConfigurationId;
	}

	public void setMemoryRagConfigurationId(long memoryRagConfigurationId) {
		this.memoryRagConfigurationId = memoryRagConfigurationId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getMemoryType() {
		return memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}

	public String getMemoryReferenceId() {
		return memoryReferenceId;
	}

	public void setMemoryReferenceId(String memoryReferenceId) {
		this.memoryReferenceId = memoryReferenceId;
	}

	public String getMemoryContent() {
		return memoryContent;
	}

	public void setMemoryContent(String memoryContent) {
		this.memoryContent = memoryContent;
	}

	public String getMemoryImportanceScore() {
		return memoryImportanceScore;
	}

	public void setMemoryImportanceScore(String memoryImportanceScore) {
		this.memoryImportanceScore = memoryImportanceScore;
	}

	public String getMemoryRelevanceScore() {
		return memoryRelevanceScore;
	}

	public void setMemoryRelevanceScore(String memoryRelevanceScore) {
		this.memoryRelevanceScore = memoryRelevanceScore;
	}

	public String getRetentionPriority() {
		return retentionPriority;
	}

	public void setRetentionPriority(String retentionPriority) {
		this.retentionPriority = retentionPriority;
	}

	public String getRetentionPolicy() {
		return retentionPolicy;
	}

	public void setRetentionPolicy(String retentionPolicy) {
		this.retentionPolicy = retentionPolicy;
	}

	public String getRetentionPeriod() {
		return retentionPeriod;
	}

	public void setRetentionPeriod(String retentionPeriod) {
		this.retentionPeriod = retentionPeriod;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastAccessedTime() {
		return lastAccessedTime;
	}

	public void setLastAccessedTime(String lastAccessedTime) {
		this.lastAccessedTime = lastAccessedTime;
	}

	public long getAccessCount() {
		return accessCount;
	}

	public void setAccessCount(long accessCount) {
		this.accessCount = accessCount;
	}

	public String getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}

	public String getPersistentMemory() {
		return persistentMemory;
	}

	public void setPersistentMemory(String persistentMemory) {
		this.persistentMemory = persistentMemory;
	}

	public String getArchiveRequired() {
		return archiveRequired;
	}

	public void setArchiveRequired(String archiveRequired) {
		this.archiveRequired = archiveRequired;
	}

	public String getArchivalLocation() {
		return archivalLocation;
	}

	public void setArchivalLocation(String archivalLocation) {
		this.archivalLocation = archivalLocation;
	}

}
