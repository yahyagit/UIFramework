/*******************************************************************************
 * Copyright (c) 2015 Gautam Sabba.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.codescaping.automation.ui.handlers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.codescaping.automation.ui.exceptions.DriverException;

public class RadioButtonHandler extends BaseHandler {

	public RadioButtonHandler(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getRadioButton(String selector) {
		return findElement(selector);
	}
	
	public void selectRadioButton(WebElement radioButton, String...waitFor) throws DriverException {
		if (radioButton != null) {
			radioButton.click();
			if (waitFor != null && waitFor.length > 0) {
				setDriverWait(waitFor[0]);
			}
		} else {
			throw new DriverException("Unable to locate radio button element");
		}
	}
	
	public void selectRadioButton(String selector, String...waitFor) throws DriverException {
		WebElement radioButton = findElement(selector);
		if (radioButton != null) {
			radioButton.click();
			if (waitFor != null && waitFor.length > 0) {
				setDriverWait(waitFor[0]);
			}
		} else {
			throw new DriverException("Unable to locate radio button element");
		}
	}
}
