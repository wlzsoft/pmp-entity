package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 知识点练习详情
 * @author Administrator
 *
 */
public class PointExerciseDetailEntity implements Serializable {

	private static final long serialVersionUID = 8598685062349072088L;
	
	  public Integer id            ;
	  public Integer userId        ;
	  public Integer bookId;//练习本Id
	  public Integer pointId        ; //知识点ID
	  
	  public Integer exerciseCycle ;// '知识点 记忆等级',
	//public Integer skilled;//熟练度（0，1，2，3）
	  public Integer conCorrectNumber ;// '连续回答正确次数',
	  public Integer conErrorNumber ;// '连续回答错误次数',
	  
	  public Date firstExerciseDate  ;//首次练习日期
	  
	  public Date lastExerciseTime  ;//上一次练习时间
	  public Date nextExerciseTime ; //下一次练习时间
	  
	  public Date lastUpdateTime;//上次记忆等级更新时间
	  public Date nextUpdateTime;//下次记忆等级更新时间
	  
	  public Integer exerciseNumber;//练习总次数
	  public float  correctRate   ;//正确率
	  public Integer  correctNumber ;//总正确数
	  public Integer errorNumber   ;//总错误数
	  public Date avgConsumingTime   ;//平均耗时
	  public float weights       ;//练习权重
	  public float  grasp         ;//掌握值
	  public Integer state ;// state :答题状态（0：新增   1：上次答错    2：巩固）
	  public Integer hidden;// 0 显示 1 隐藏
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getLastExerciseTime() {
		return lastExerciseTime;
	}
	public void setLastExerciseTime(Date lastExerciseTime) {
		this.lastExerciseTime = lastExerciseTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getNextUpdateTime() {
		return nextUpdateTime;
	}
	public void setNextUpdateTime(Date nextUpdateTime) {
		this.nextUpdateTime = nextUpdateTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Date getNextExerciseTime() {
		return nextExerciseTime;
	}
	public void setNextExerciseTime(Date nextExerciseTime) {
		this.nextExerciseTime = nextExerciseTime;
	}
	
	public Integer getExerciseCycle() {
		return exerciseCycle;
	}
	public void setExerciseCycle(Integer exerciseCycle) {
		this.exerciseCycle = exerciseCycle;
	}
	public Integer getConCorrectNumber() {
		return conCorrectNumber;
	}
	public void setConCorrectNumber(Integer conCorrectNumber) {
		this.conCorrectNumber = conCorrectNumber;
	}
	public Integer getConErrorNumber() {
		return conErrorNumber;
	}
	public void setConErrorNumber(Integer conErrorNumber) {
		this.conErrorNumber = conErrorNumber;
	}

	public Integer getPointId() {
		return pointId;
	}
	public void setPointId(Integer pointId) {
		this.pointId = pointId;
	}
	public Date getFirstExerciseDate() {
		return firstExerciseDate;
	}
	public void setFirstExerciseDate(Date firstExerciseDate) {
		this.firstExerciseDate = firstExerciseDate;
	}
	
	public Integer getExerciseNumber() {
		return exerciseNumber;
	}
	public void setExerciseNumber(Integer exerciseNumber) {
		this.exerciseNumber = exerciseNumber;
	}
	public float getCorrectRate() {
		return correctRate;
	}
	public void setCorrectRate(float correctRate) {
		this.correctRate = correctRate;
	}
	public Integer getCorrectNumber() {
		return correctNumber;
	}
	public void setCorrectNumber(Integer correctNumber) {
		this.correctNumber = correctNumber;
	}
	public Integer getErrorNumber() {
		return errorNumber;
	}
	public void setErrorNumber(Integer errorNumber) {
		this.errorNumber = errorNumber;
	}
	public Date getAvgConsumingTime() {
		return avgConsumingTime;
	}
	public void setAvgConsumingTime(Date avgConsumingTime) {
		this.avgConsumingTime = avgConsumingTime;
	}
	public float getWeights() {
		return weights;
	}
	public void setWeights(float weights) {
		this.weights = weights;
	}
	public float getGrasp() {
		return grasp;
	}
	public void setGrasp(float grasp) {
		this.grasp = grasp;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getHidden() {
		return hidden;
	}
	public void setHidden(Integer hidden) {
		this.hidden = hidden;
	}
	
}
