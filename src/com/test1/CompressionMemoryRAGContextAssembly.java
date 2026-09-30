package com.test1;

public class CompressionMemoryRAGContextAssembly {
	private long contextAssemblyId;
	private long memoryRagConfigurationId;
	private String sessionId;
	private String userQuery;
	private String recentContext;
	private String compressedContext;
	private String retrievedLongTermMemory;
	private String retrievedKnowledgeContext;
	private long shortTermMemoryTokenCount;
	private long longTermMemoryTokenCount;
	private long knowledgeContextTokenCount;
	private long totalContextTokenCount;
	private long maximumContextTokens;
	private String contextSelectionStrategy;
	private String memoryRankingStrategy;
	private String contextCompressionRequired;
	private String contextTruncated;
	private String contextRelevanceScore;

	public CompressionMemoryRAGContextAssembly() {

	}

	public CompressionMemoryRAGContextAssembly(long contextAssemblyId, long memoryRagConfigurationId, String sessionId,
			String userQuery, String recentContext, String compressedContext, String retrievedLongTermMemory,
			String retrievedKnowledgeContext, long shortTermMemoryTokenCount, long longTermMemoryTokenCount,
			long knowledgeContextTokenCount, long totalContextTokenCount, long maximumContextTokens,
			String contextSelectionStrategy, String memoryRankingStrategy, String contextCompressionRequired,
			String contextTruncated, String contextRelevanceScore) {
		super();
		this.contextAssemblyId = contextAssemblyId;
		this.memoryRagConfigurationId = memoryRagConfigurationId;
		this.sessionId = sessionId;
		this.userQuery = userQuery;
		this.recentContext = recentContext;
		this.compressedContext = compressedContext;
		this.retrievedLongTermMemory = retrievedLongTermMemory;
		this.retrievedKnowledgeContext = retrievedKnowledgeContext;
		this.shortTermMemoryTokenCount = shortTermMemoryTokenCount;
		this.longTermMemoryTokenCount = longTermMemoryTokenCount;
		this.knowledgeContextTokenCount = knowledgeContextTokenCount;
		this.totalContextTokenCount = totalContextTokenCount;
		this.maximumContextTokens = maximumContextTokens;
		this.contextSelectionStrategy = contextSelectionStrategy;
		this.memoryRankingStrategy = memoryRankingStrategy;
		this.contextCompressionRequired = contextCompressionRequired;
		this.contextTruncated = contextTruncated;
		this.contextRelevanceScore = contextRelevanceScore;
	}

	public long getContextAssemblyId() {
		return contextAssemblyId;
	}

	public void setContextAssemblyId(long contextAssemblyId) {
		this.contextAssemblyId = contextAssemblyId;
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

	public String getUserQuery() {
		return userQuery;
	}

	public void setUserQuery(String userQuery) {
		this.userQuery = userQuery;
	}

	public String getRecentContext() {
		return recentContext;
	}

	public void setRecentContext(String recentContext) {
		this.recentContext = recentContext;
	}

	public String getCompressedContext() {
		return compressedContext;
	}

	public void setCompressedContext(String compressedContext) {
		this.compressedContext = compressedContext;
	}

	public String getRetrievedLongTermMemory() {
		return retrievedLongTermMemory;
	}

	public void setRetrievedLongTermMemory(String retrievedLongTermMemory) {
		this.retrievedLongTermMemory = retrievedLongTermMemory;
	}

	public String getRetrievedKnowledgeContext() {
		return retrievedKnowledgeContext;
	}

	public void setRetrievedKnowledgeContext(String retrievedKnowledgeContext) {
		this.retrievedKnowledgeContext = retrievedKnowledgeContext;
	}

	public long getShortTermMemoryTokenCount() {
		return shortTermMemoryTokenCount;
	}

	public void setShortTermMemoryTokenCount(long shortTermMemoryTokenCount) {
		this.shortTermMemoryTokenCount = shortTermMemoryTokenCount;
	}

	public long getLongTermMemoryTokenCount() {
		return longTermMemoryTokenCount;
	}

	public void setLongTermMemoryTokenCount(long longTermMemoryTokenCount) {
		this.longTermMemoryTokenCount = longTermMemoryTokenCount;
	}

	public long getKnowledgeContextTokenCount() {
		return knowledgeContextTokenCount;
	}

	public void setKnowledgeContextTokenCount(long knowledgeContextTokenCount) {
		this.knowledgeContextTokenCount = knowledgeContextTokenCount;
	}

	public long getTotalContextTokenCount() {
		return totalContextTokenCount;
	}

	public void setTotalContextTokenCount(long totalContextTokenCount) {
		this.totalContextTokenCount = totalContextTokenCount;
	}

	public long getMaximumContextTokens() {
		return maximumContextTokens;
	}

	public void setMaximumContextTokens(long maximumContextTokens) {
		this.maximumContextTokens = maximumContextTokens;
	}

	public String getContextSelectionStrategy() {
		return contextSelectionStrategy;
	}

	public void setContextSelectionStrategy(String contextSelectionStrategy) {
		this.contextSelectionStrategy = contextSelectionStrategy;
	}

	public String getMemoryRankingStrategy() {
		return memoryRankingStrategy;
	}

	public void setMemoryRankingStrategy(String memoryRankingStrategy) {
		this.memoryRankingStrategy = memoryRankingStrategy;
	}

	public String getContextCompressionRequired() {
		return contextCompressionRequired;
	}

	public void setContextCompressionRequired(String contextCompressionRequired) {
		this.contextCompressionRequired = contextCompressionRequired;
	}

	public String getContextTruncated() {
		return contextTruncated;
	}

	public void setContextTruncated(String contextTruncated) {
		this.contextTruncated = contextTruncated;
	}

	public String getContextRelevanceScore() {
		return contextRelevanceScore;
	}

	public void setContextRelevanceScore(String contextRelevanceScore) {
		this.contextRelevanceScore = contextRelevanceScore;
	}

}
