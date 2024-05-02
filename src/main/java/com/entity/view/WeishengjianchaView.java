package com.entity.view;

import com.entity.WeishengjianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 卫生检查
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("weishengjiancha")
public class WeishengjianchaView extends WeishengjianchaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 检查结果的值
		*/
		private String weishengjianchaValue;



		//级联表 sushe
			/**
			* 楼栋
			*/
			private String building;
			/**
			* 单元
			*/
			private String unit;
			/**
			* 房间号
			*/
			private String room;
			/**
			* 已住人员
			*/
			private Integer susheNumber;

	public WeishengjianchaView() {

	}

	public WeishengjianchaView(WeishengjianchaEntity weishengjianchaEntity) {
		try {
			BeanUtils.copyProperties(this, weishengjianchaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 检查结果的值
			*/
			public String getWeishengjianchaValue() {
				return weishengjianchaValue;
			}
			/**
			* 设置： 检查结果的值
			*/
			public void setWeishengjianchaValue(String weishengjianchaValue) {
				this.weishengjianchaValue = weishengjianchaValue;
			}






















				//级联表的get和set sushe
					/**
					* 获取： 楼栋
					*/
					public String getBuilding() {
						return building;
					}
					/**
					* 设置： 楼栋
					*/
					public void setBuilding(String building) {
						this.building = building;
					}
					/**
					* 获取： 单元
					*/
					public String getUnit() {
						return unit;
					}
					/**
					* 设置： 单元
					*/
					public void setUnit(String unit) {
						this.unit = unit;
					}
					/**
					* 获取： 房间号
					*/
					public String getRoom() {
						return room;
					}
					/**
					* 设置： 房间号
					*/
					public void setRoom(String room) {
						this.room = room;
					}
					/**
					* 获取： 已住人员
					*/
					public Integer getSusheNumber() {
						return susheNumber;
					}
					/**
					* 设置： 已住人员
					*/
					public void setSusheNumber(Integer susheNumber) {
						this.susheNumber = susheNumber;
					}








}