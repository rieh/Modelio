/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ModelerModule v9.1.00

 * This file was generated on 3/2/20 11:26 AM by Modelio Studio.
 */
package org.modelio.module.modelermodule.api.default_.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.modelermodule.api.IModelerModulePeerModule;
import org.modelio.module.modelermodule.api.ModelerModuleProxyFactory;
import org.modelio.module.modelermodule.impl.ModelerModuleModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << ordered >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("42a643e7-92ca-450c-bc7b-c44d1f137341")
public class Ordered {
    @objid ("4622a13a-c274-4552-bdf5-a044c2b0f6be")
    public static final String STEREOTYPE_NAME = "ordered";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("95710741-ef4c-402e-92ce-f827aa0344e7")
    protected final Constraint elt;

    /**
     * Tells whether a {@link Ordered proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << ordered >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f204b10b-8884-40f0-8133-9f0aab224758")
    public static boolean canInstantiate(MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IModelerModulePeerModule.MODULE_NAME, Ordered.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << ordered >> then instantiate a {@link Ordered} proxy.
     * 
     * @return a {@link Ordered} proxy on the created {@link Constraint}.
     */
    @objid ("16fb7a0a-08d4-44f3-9444-0bf4d154e81b")
    public static Ordered create() {
        ModelElement e = (ModelElement)ModelerModuleModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IModelerModulePeerModule.MODULE_NAME, Ordered.STEREOTYPE_NAME);
        return Ordered.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link Ordered} proxy from a {@link Constraint} stereotyped << ordered >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link Ordered} proxy or <i>null</i>.
     */
    @objid ("b0526e39-a3c2-46c0-b832-857cf0913651")
    public static Ordered instantiate(Constraint obj) {
        return Ordered.canInstantiate(obj) ? new Ordered(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Ordered} proxy from a {@link Constraint} stereotyped << ordered >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link Ordered} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("deb036d3-4946-4e3e-9fc1-36c692a7933c")
    public static Ordered safeInstantiate(Constraint obj) throws IllegalArgumentException {
        if (Ordered.canInstantiate(obj))
        	return new Ordered(obj);
        else
        	throw new IllegalArgumentException("Ordered: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("825b9c33-bcde-4d8a-897e-c97c4b4eb78a")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Ordered other = (Ordered) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("61cd2acd-1177-4f88-9519-7aeb8df5b0aa")
    public Constraint getElement() {
        return this.elt;
    }

    @objid ("6ca61c61-4776-4b1f-ae96-7d406afac0bb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("379ccffd-c222-4622-9f26-8019c3c3c53d")
    protected Ordered(Constraint elt) {
        this.elt = elt;
    }

    @objid ("ce113c67-b988-43ce-b615-4a87a781f4e7")
    public static final class MdaTypes {
        @objid ("d43b2602-1262-4fdc-abee-4e7cd765b994")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c43e3902-dd62-46ea-839f-b968f74446c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("b4b0e586-909a-4da7-86f8-471ef05a6196")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08473a31-d766-4d81-bf73-6118b32acb0c")
        public static void init(IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00540a84-0000-0003-0000-000000000000");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(ModelerModuleModule.getInstance() != null) {
			init(ModelerModuleModule.getInstance().getModuleContext());
		}
	}
    }

}
