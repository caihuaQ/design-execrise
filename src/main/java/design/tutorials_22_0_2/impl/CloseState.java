package design.tutorials_22_0_2.impl;


import design.tutorials_22_0_0.ActivityService;
import design.tutorials_22_0_0.Status;
import design.tutorials_22_0_2.Result;
import design.tutorials_22_0_2.State;

/**
 * 活动状态；活动关闭
 */
public class CloseState extends State {

    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可提审");
    }

    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可审核通过");
    }

    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可审核拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可撤销审核");
    }

    public Result close(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可重复关闭");
    }

    public Result open(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.Open);
        return new Result("0000", "活动开启完成");
    }

    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可变更活动中");
    }

}
