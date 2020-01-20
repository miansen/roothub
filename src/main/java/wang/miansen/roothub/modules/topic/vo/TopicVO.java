package wang.miansen.roothub.modules.topic.vo;

import wang.miansen.roothub.common.vo.BaseVO;

/**
 * @author miansen.wang
 * @date 2020-01-19
 */
public class TopicVO implements BaseVO {

	/**
	 * 帖子 ID
	 */
	private Integer topicId;
	
	/**
	 * 板块 ID
	 */
	private Integer tabId;
	
	/**
	 * 版块名称
	 */
	private String tabName;
	
	/**
	 * 节点 ID
	 */
	private Integer nodeId;
	
	/**
	 * 节点名称
	 */
	private String nodeName;
	
	/**
	 * 帖子标题
	 */
	private String title;
	
	/**
	 * 正文
	 */
	private String content;
	
	/**
	 * 摘录
	 */
	private String excerpt;
	
	/**
	 * 封面
	 */
	private String avatar;
	
	/**
	 * 链接
	 */
	private String url;
	
	/**
	 * true 置顶 false 默认
	 */
	private Boolean top;
	
	/**
	 * true 精华 false默认
	 */
	private Boolean good;
	
	/**
	 * 浏览量
	 */
	private Integer viewCount;
	
	/**
	 * 转载量
	 */
	private Integer shareCount;
	
	/**
	 * 好评量
	 */
	private Integer goodCount;
	
	/**
	 * 差评量
	 */
	private Integer postGoodCount;
	
	/**
	 * 创建时间
	 */
	private String createDate;
	
	/**
	 * 更新时间
	 */
	private String updateDate;
	
	/**
	 * 类型：文本、图片、视频、链接
	 */
	private String type;
	
	/**
	 * 状态：有效、无效、未生效
	 */
	private String status;
	
	/**
	 * 备注
	 */
	private String remark;

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public Integer getTabId() {
		return tabId;
	}

	public void setTabId(Integer tabId) {
		this.tabId = tabId;
	}

	public String getTabName() {
		return tabName;
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	public Integer getNodeId() {
		return nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getTop() {
		return top;
	}

	public void setTop(Boolean top) {
		this.top = top;
	}

	public Boolean getGood() {
		return good;
	}

	public void setGood(Boolean good) {
		this.good = good;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Integer getShareCount() {
		return shareCount;
	}

	public void setShareCount(Integer shareCount) {
		this.shareCount = shareCount;
	}

	public Integer getGoodCount() {
		return goodCount;
	}

	public void setGoodCount(Integer goodCount) {
		this.goodCount = goodCount;
	}

	public Integer getPostGoodCount() {
		return postGoodCount;
	}

	public void setPostGoodCount(Integer postGoodCount) {
		this.postGoodCount = postGoodCount;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "TopicVO {topicId=" + topicId + ", tabId=" + tabId + ", tabName=" + tabName + ", nodeId=" + nodeId
				+ ", nodeName=" + nodeName + ", title=" + title + ", content=" + content + ", excerpt=" + excerpt
				+ ", avatar=" + avatar + ", url=" + url + ", top=" + top + ", good=" + good + ", viewCount=" + viewCount
				+ ", shareCount=" + shareCount + ", goodCount=" + goodCount + ", postGoodCount=" + postGoodCount
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + ", type=" + type + ", status=" + status
				+ ", remark=" + remark + "}";
	}
	
}