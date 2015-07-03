/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.machine.shared.dto.recipe;

import org.eclipse.che.api.machine.shared.ManagedRecipe;
import org.eclipse.che.api.machine.shared.Recipe;
import org.eclipse.che.dto.shared.DTO;

import java.util.List;

/**
 * @author Eugene Voevodin
 */
@DTO
public interface RecipeUpdate extends ManagedRecipe {

    String getType();

    void setType(String type);

    RecipeUpdate withType(String type);

    String getScript();

    void setScript(String script);

    RecipeUpdate withScript(String script);

    List<String> getTags();

    void setTags(List<String> tags);

    RecipeUpdate withTags(List<String> tags);

    PermissionsDescriptor getPermissions();

    void setPermissions(PermissionsDescriptor permissions);

    RecipeUpdate withPermissions(PermissionsDescriptor permissions);
}
