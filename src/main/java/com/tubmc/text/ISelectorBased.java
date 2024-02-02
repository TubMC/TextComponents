package com.tubmc.text;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.ApiStatus.Internal;

import fun.bb1.objects.annotations.DisallowsEmptyString;

/**
 *    Copyright 2023 TubMC.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
/**
 * Defines selector based functionality for components that use it
 * 
 * @author BradBot_1
 * @since 1.0.0
 * @version 1.0.0
 * @see IScoreboardComponent
 * @see ISelectedComponent
 */
@Internal
interface ISelectorBased {
	/**
	 * @since 1.0.0
	 * @return The selector to use
	 */
	public @NotNull @DisallowsEmptyString String getSelector();
	/**
	 * @since 1.0.0
	 * @param newSelector The new selector to use
	 */
	public void setSelector(final @NotNull @DisallowsEmptyString String newSelector);
}