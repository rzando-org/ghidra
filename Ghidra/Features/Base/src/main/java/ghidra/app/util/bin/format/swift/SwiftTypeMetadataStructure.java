/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.util.bin.format.swift;

import ghidra.app.util.bin.StructConverter;

/**
 * Implemented by all Swift type metadata structures
 */
public abstract class SwiftTypeMetadataStructure implements StructConverter {

	public static final String DATA_TYPE_CATEGORY = "/SwiftTypeMetadata";
	
	private long base;

	public SwiftTypeMetadataStructure(long base) {
		this.base = base;
	}

	/**
	 * Gets the base "address" of this {@link SwiftTypeMetadataStructure}
	 * 
	 * @return The base "address" of this {@link SwiftTypeMetadataStructure}
	 */
	public long getBase() {
		return base;
	}

	/**
	 * Gets the name of the {@link SwiftTypeMetadataStructure}
	 * 
	 * @return The name of the {@link SwiftTypeMetadataStructure}
	 */
	public abstract String getStructureName();

	/**
	 * Gets a short description of the {@link SwiftTypeMetadataStructure}
	 * 
	 * @return A short description of the {@link SwiftTypeMetadataStructure}
	 */
	public abstract String getDescription();
}
