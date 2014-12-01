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
package at.bestsolution.framework.grid.component.e4;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jdt.annotation.NonNull;

import at.bestsolution.framework.grid.XSelection;
import at.bestsolution.framework.grid.component.XSelectionPublisher;

/**
 * Context function to publish the selection
 */
public class XSelectionPublisherCF extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		ESelectionService es = context.get(ESelectionService.class);
		if( es == null ) {
			return null;
		}
		return new Publisher(es);
	}

	static class Publisher implements XSelectionPublisher {
		@NonNull
		private final ESelectionService es;

		public Publisher(@NonNull ESelectionService es) {
			this.es = es;
		}

		@Override
		public void publishSelection(XSelection<?> selection) {
			es.setSelection(selection);
		}

	}
}