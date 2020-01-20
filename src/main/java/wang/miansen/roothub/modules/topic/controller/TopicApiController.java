package wang.miansen.roothub.modules.topic.controller;

import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wang.miansen.roothub.common.beans.Page;
import wang.miansen.roothub.common.beans.Result;
import wang.miansen.roothub.common.controller.AbstractBaseController;
import wang.miansen.roothub.common.dao.mapper.wrapper.query.QueryWrapper;
import wang.miansen.roothub.common.service.BaseService;
import wang.miansen.roothub.common.util.ApiAssert;
import wang.miansen.roothub.common.util.DateUtil;
import wang.miansen.roothub.modules.node.dto.NodeDTO;
import wang.miansen.roothub.modules.node.service.NodeService;
import wang.miansen.roothub.modules.topic.dto.TopicDTO;
import wang.miansen.roothub.modules.topic.enums.TopicErrorCodeEnum;
import wang.miansen.roothub.modules.topic.exception.TopicApiException;
import wang.miansen.roothub.modules.topic.model.Topic;
import wang.miansen.roothub.modules.topic.service.TopicService;
import wang.miansen.roothub.modules.topic.vo.TopicVO;
import wang.miansen.roothub.modules.user.model.User;

/**
 * @author miansen.wang
 * @date 2020-01-20
 */
@RestController
@RequestMapping(value = "api/v3")
public class TopicApiController extends AbstractBaseController<Topic, TopicDTO, TopicVO> {

	@Autowired
	private TopicService topicService;
	
	@Autowired NodeService nodeService;
	
	@Override
	@RequestMapping(value = "/topic", method = RequestMethod.POST)
	public Result<TopicVO> save(@RequestBody TopicVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*User user = getUser(request);
		if (user == null) {
			throw new TopicApiException(TopicErrorCodeEnum.USER_BE_BANNED);
		}
        ApiAssert.notNull(user, "请先登录");*/
        // ApiAssert.notEmpty(vo.getTitle(), "帖子标题不能为空");
        // ApiAssert.notNull(vo.getNodeId(), "节点 ID 不能为空");
        // NodeDTO nodeDTO = nodeService.getById(vo.getNodeId());
        // ApiAssert.notNull(nodeDTO, "节点不存在，请重新选择节点。");
		return super.save(vo, request, response);
	}

	@Override
	public Result<TopicVO> remove(Integer id, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return super.remove(id, request, response);
	}

	@Override
	public Result<TopicVO> update(Integer id, TopicVO vo, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return super.update(id, vo, request, response);
	}

	@Override
	public Result<TopicVO> getOne(Integer id, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return super.getOne(id, request, response);
	}

	@Override
	public Result<Page<? extends TopicVO>> page(Integer pageNumber, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		return super.page(pageNumber, request, response);
	}

	@Override
	protected Function<? super TopicDTO, ? extends TopicVO> getDTO2VO() {
		return topicDTO -> {
			TopicVO topicVO = new TopicVO();
			BeanUtils.copyProperties(topicDTO, topicVO);
			topicVO.setTabId(topicDTO.getTabDTO().getId());
			topicVO.setTabName(topicDTO.getTabDTO().getTabName());
			topicVO.setNodeId(topicDTO.getNodeDTO().getNodeId());
			topicVO.setNodeName(topicDTO.getNodeDTO().getNodeTitle());
			topicVO.setCreateDate(DateUtil.formatDateTime(topicDTO.getCreateDate()));
			topicVO.setUpdateDate(DateUtil.formatDateTime(topicDTO.getUpdateDate()));
			return topicVO;
		};
	}

	@Override
	protected Function<? super TopicVO, ? extends TopicDTO> getVO2DTO() {
		return topicVO -> {
			TopicDTO topicDTO = new TopicDTO();
			BeanUtils.copyProperties(topicVO, topicDTO);
			// NodeDTO nodeDTO = nodeService.getById(topicVO.getNodeId());
			topicDTO.setNodeDTO(null);
			topicDTO.setCreateDate(DateUtil.string2Date(topicVO.getCreateDate(), DateUtil.FORMAT_DATETIME));
			topicDTO.setUpdateDate(DateUtil.string2Date(topicVO.getUpdateDate(), DateUtil.FORMAT_DATETIME));
			return topicDTO;
		};
	}

	@Override
	protected BaseService<Topic, TopicDTO> getService() {
		return topicService;
	}

	@Override
	protected String getModuleName() {
		return "topic";
	}

	@Override
	protected QueryWrapper<Topic> getQueryWrapper() {
		return null;
	}

}