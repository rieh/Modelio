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
package org.modelio.module.modelermodule.api.xmi.standard.opaqueaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
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
 * Proxy class to handle a {@link OpaqueAction} with << UML2RaiseExceptionAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("59fa1fa5-bbf1-4055-b693-6d921c22cd94")
public class UML2RaiseExceptionAction {
    @objid ("b58b2f27-ed67-4841-80e1-d79cdbc17249")
    public static final String STEREOTYPE_NAME = "UML2RaiseExceptionAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("8ae9fdf4-9b1a-4426-b272-b9475084aa19")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link UML2RaiseExceptionAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << UML2RaiseExceptionAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ad19a833-1141-462a-910e-0d6795939a28")
    public static boolean canInstantiate(MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IModelerModulePeerModule.MODULE_NAME, UML2RaiseExceptionAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << UML2RaiseExceptionAction >> then instantiate a {@link UML2RaiseExceptionAction} proxy.
     * 
     * @return a {@link UML2RaiseExceptionAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("c55d27dc-51b8-4d4e-9862-1ee8d425aed6")
    public static UML2RaiseExceptionAction create() {
        ModelElement e = (ModelElement)ModelerModuleModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("OpaqueAction");
        e.addStereotype(IModelerModulePeerModule.MODULE_NAME, UML2RaiseExceptionAction.STEREOTYPE_NAME);
        return UML2RaiseExceptionAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link UML2RaiseExceptionAction} proxy from a {@link OpaqueAction} stereotyped << UML2RaiseExceptionAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link UML2RaiseExceptionAction} proxy or <i>null</i>.
     */
    @objid ("b56d0a3f-90ff-4d59-af87-3b4bc42d9bdd")
    public static UML2RaiseExceptionAction instantiate(OpaqueAction obj) {
        return UML2RaiseExceptionAction.canInstantiate(obj) ? new UML2RaiseExceptionAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UML2RaiseExceptionAction} proxy from a {@link OpaqueAction} stereotyped << UML2RaiseExceptionAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link UML2RaiseExceptionAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("98c9dfa7-b74d-4e61-89eb-8b0c4ce4d93c")
    public static UML2RaiseExceptionAction safeInstantiate(OpaqueAction obj) throws IllegalArgumentException {
        if (UML2RaiseExceptionAction.canInstantiate(obj))
        	return new UML2RaiseExceptionAction(obj);
        else
        	throw new IllegalArgumentException("UML2RaiseExceptionAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5228a107-f3dd-4781-8ac4-c0aa46d5fe06")
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
        UML2RaiseExceptionAction other = (UML2RaiseExceptionAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("09668593-4e4a-423a-bcda-f977ba0f70d0")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("9d6be9a6-6b2e-4d6c-b302-bd1e5fb34e54")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("364094c9-7807-40d1-a622-ab5fb4124ddc")
    protected UML2RaiseExceptionAction(OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("756bcc2b-8b40-459d-9679-09445f1d90d8")
    public static final class MdaTypes {
        @objid ("c0eb5c9a-d868-42a7-99ad-3263a6cd44c0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7af89c6d-7bc9-4c79-a26e-6635f244f08b")
        private static Stereotype MDAASSOCDEP;

        @objid ("e37161c3-e2c0-4a8f-821c-64da6764803a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2ab9f572-10ec-41d0-913a-704b81722803")
        public static void init(IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d09356f1-c2fc-11de-8ac8-001302895b2b");
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
