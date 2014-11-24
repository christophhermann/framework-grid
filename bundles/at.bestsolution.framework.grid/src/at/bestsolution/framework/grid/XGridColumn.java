/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at EDV Systemhaus GmbH/Austria,
 * http://www.BestSolution.at
 *
 * This file is part of framework-grid which was developed with funding
 * from DI Christoph Hermann - InformationsTechnologie Beratung Hermann
 * /Austria.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package at.bestsolution.framework.grid;

import java.net.URI;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import at.bestsolution.framework.grid.func.CellDataFunction;
import at.bestsolution.framework.grid.func.CellValueMatcherFunction;

/**
 * Column of a grid
 *
 * @param <R>
 *            the row type
 * @param <C>
 *            the column type
 * @since 1.0
 */
public interface XGridColumn<@NonNull R, @Nullable C> {
	/**
	 * Type of the auto filters
	 *
	 * @since 1.0
	 */
	public enum AutoFilterType {
		/**
		 * No auto filtering
		 */
		NONE,
		/**
		 * Show a drop down as the auto filter
		 */
		DROPDOWN,
		/**
		 * Show a text field as the auto filter
		 */
		TEXT
	}

	/**
	 * Column alignment
	 *
	 * @since 1.0
	 */
	public enum Alignment {
		/**
		 * Left alignment
		 */
		LEFT,
		/**
		 * Center alignment
		 */
		CENTER,
		/**
		 * right alignment
		 */
		RIGHT
	}

	/**
	 * Column sorting
	 *
	 * @since 1.0
	 */
	public enum Sorting {
		/**
		 * Not sorted
		 */
		NONE,
		/**
		 * Up
		 */
		UP,
		/**
		 * Down
		 */
		DOWN
	}

	/**
	 * The label property
	 *
	 * @return the label property
	 */
	@NonNull
	Property<@Nullable String> labelProperty();

	/**
	 * The icon to display
	 *
	 * @return the icon property
	 */
	@NonNull
	Property<@Nullable URI> iconProperty();

	/**
	 * The maximum width.
	 *
	 * <p>
	 * For a fixed width set {@link #maxWidthProperty()} and
	 * {@link #minWidthProperty()} to the same value
	 * </p>
	 *
	 * @return the max width property
	 */
	@NonNull
	Property<@Nullable Integer> maxWidthProperty();

	/**
	 * The minimum width
	 * <p>
	 * For a fixed width set {@link #maxWidthProperty()} and
	 * {@link #minWidthProperty()} to the same value
	 * </p>
	 *
	 * @return the min width property
	 */
	@NonNull
	Property<@Nullable Integer> minWidthProperty();

	/**
	 * Calculate the width from the content
	 * <p>
	 * Default is {@link Boolean#FALSE}
	 * </p>
	 *
	 * @return the auto width property
	 */
	@NonNull
	Property<@NonNull Boolean> autoWidthProperty();

	/**
	 * The provider of the cell value
	 *
	 * @return the provider property
	 */
	@NonNull
	Property<@NonNull Function<@NonNull R, @Nullable C>> cellValueFunctionProperty();

	/**
	 * The text provider who converts the cell value to a rendered text
	 *
	 * <p>
	 * Default provider creates a {@link Object#toString()} representation of
	 * the value
	 * </p>
	 *
	 * @return the provider property
	 */
	@NonNull
	Property<@NonNull CellDataFunction<@NonNull R, @Nullable C, @Nullable CharSequence>> textFunctionProperty();

	/**
	 * The icon provider who converts the cell value to a rendered icon
	 * <p>
	 * Default provider returns <code>null</code> for the icon uri
	 * </p>
	 *
	 * @return the provider property
	 */
	@NonNull
	Property<@NonNull CellDataFunction<@NonNull R, @Nullable C, @Nullable URI>> iconFunctionProperty();

	/**
	 * The auto filter type
	 * <p>
	 * Default filter type {@link AutoFilterType#NONE}
	 * </p>
	 *
	 * @return the property
	 */
	@NonNull
	Property<@NonNull AutoFilterType> autoFilterTypeProperty();

	/**
	 * The sorting type
	 * <p>
	 * Default sorting {@link Sorting#NONE}
	 * </p>
	 *
	 * @return the property
	 */
	@NonNull
	Property<@NonNull Sorting> sortingProperty();

	/**
	 * The alignment
	 * <p>
	 * Default alignment {@link Alignment#LEFT}
	 * </p>
	 *
	 * @return the property
	 */
	@NonNull
	Property<@NonNull Alignment> alignmentProperty();

	/**
	 * The auto filter matcher used to match elements
	 * <p>
	 * Default matcher use {@link Object#equals(Object)} of the cell value
	 * </p>
	 *
	 * @return the matcher property
	 */
	@NonNull
	Property<@NonNull CellValueMatcherFunction<@NonNull R, @Nullable C, @NonNull Object>> autoFilterMatcherFunctionProperty();

	/**
	 * Provides predefined filter values
	 * <p>
	 * Default supplier provides an empty list
	 * </p>
	 *
	 * @return the provider property
	 */
	@NonNull
	Property<@NonNull Supplier<@NonNull List<@NonNull Object>>> autoFilterDataSupplierProperty();

	/**
	 * Converts the predefined auto filter types as text
	 * <p>
	 * Default converter use {@link Object#toString()}
	 * </p>
	 *
	 * @return the provider property
	 */
	@NonNull
	Property<Function<@NonNull Object, @Nullable CharSequence>> autoFilterTextFunctionProperty();

	/**
	 * Property for the sort of this column
	 *
	 * @return the provider
	 */
	@NonNull
	Property<@Nullable Comparator<@NonNull R>> sorterProperty();

	/**
	 * Property for the column index
	 *
	 * @return column index
	 */
	@NonNull
	Property<@NonNull Integer> indexProperty();

	/**
	 * Grid which contains this column
	 * 
	 * @return containing grid
	 */
	@NonNull
	XGrid<R, XGridContentProvider<R>> getGrid();

	/**
	 * request to update column cells
	 */
	void requestUpdate();

	/**
	 * request to update the cell for a given element
	 * 
	 * @param element
	 *            the element to update
	 */
	void requestUpdate(R element);

	/**
	 * dispose column
	 */
	void dispose();
}
