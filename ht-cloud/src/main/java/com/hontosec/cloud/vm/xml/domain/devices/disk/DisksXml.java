/**
 * @Company fangyi
 * @Author fangyi
 * @Time 2022年6月7日
 */
package com.hontosec.cloud.vm.xml.domain.devices.disk;

import com.hontosec.cloud.vm.xml.domain.devices.disk.address.Address1Xml;
import com.hontosec.cloud.vm.xml.domain.devices.disk.driver.DriverXml;
import com.hontosec.cloud.vm.xml.domain.devices.disk.target.TargetXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DisksXml {
	@XmlAttribute(name="type")
	private String type;

	@XmlAttribute(name="device")
	private String device;

	@XmlElement(name = "driver")
	private DriverXml driver;
	/**
	 *  盘符
	 */
	@XmlElement(name = "target")
	private TargetXml target;
	/**
	 *  表示磁盘具有只读属性，磁盘内容不可以被虚拟机修改，通常与光驱结合使用
	 */
	@XmlElement(name = "readonly")
	private String readonly;

	@XmlElement(name = "address")
	private Address1Xml address;

	public Address1Xml getAddress() {
		return address;
	}

	public void setAddress(Address1Xml address) {
		this.address = address;
	}

	public DriverXml getDriver() {
		return driver;
	}

	public void setDriver(DriverXml driver) {
		this.driver = driver;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getReadonly() {
		return readonly;
	}

	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}

	public TargetXml getTarget() {
		return target;
	}

	public void setTarget(TargetXml target) {
		this.target = target;
	}
}
