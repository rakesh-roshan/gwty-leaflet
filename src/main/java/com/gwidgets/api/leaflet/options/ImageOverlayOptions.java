/**
 *  Copyright 2016 G-Widgets
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;



/**
 * The Class ImageOverlayOptions.
 * 
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class ImageOverlayOptions {
	
	
	private ImageOverlayOptions() {
		
	}

	@JsProperty
	private Number opacity;
	
	@JsProperty
	private String attribution;
	
	
	
	/**
	 * Gets The opacity of the image overlay.
	 *
	 * @return the opacity
	 */
	@JsOverlay public final Number getOpacity() {
		return this.opacity;
	}



	/**
	 * Gets The attribution text of the image overlay. empty by default
	 *
	 * @return the attribution
	 */
	@JsOverlay public final String getAttribution() {
		return this.attribution;
	}



	/**
	 * The Class Builder.
	 */
	public static class Builder {
		
		private Number opacity = 1.0;
		
		private String attribution = "";

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {

		}
		
		/**
		 * The opacity of the image overlay.
		 * </br>
		 * default 1.0
		 * @param opacity the opacity
		 * @return the builder
		 */
		public Builder opacity(Number opacity){
			this.opacity = opacity;
			return this;
		}
		
		/**
		 * The attribution text of the image overlay.
		 *</br>
		 *default empty
		 * @param attribution the attribution
		 * @return the builder
		 */
		public Builder attribution(String attribution){
			this.attribution = attribution;
			return this;
		}
		
		/**
		 * Builds the ImageOverlayOptions instance
		 *
		 * @return the image overlay options
		 */
		public ImageOverlayOptions build(){
			ImageOverlayOptions options = new ImageOverlayOptions();
			options.opacity = this.opacity;
			options.attribution = this.attribution;
		
			return options;
		}

	}

}