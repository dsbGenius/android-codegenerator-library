package com.morcinek.android.codegenerator.model;

/**
 * Copyright 2014 Tomasz Morcinek. All rights reserved.
 */
public class ResourceObject {

    private ResourceId resourceId;

    private ResourceType resourceType;

    public ResourceObject(ResourceId resourceId, ResourceType resourceType) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    public ResourceId getResourceId() {
        return resourceId;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }
}
