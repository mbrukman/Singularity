package com.hubspot.singularity;

import java.util.List;

import com.google.common.base.Optional;

public class SingularityRequestBuilder {

  private final String id;
  private final RequestType requestType;

  private Optional<List<String>> owners;
  private Optional<Integer> numRetriesOnFailure;

  private Optional<String> schedule;
  private Optional<String> quartzSchedule;
  private Optional<ScheduleType> scheduleType;

  private Optional<Long> killOldNonLongRunningTasksAfterMillis;
  private Optional<Long> scheduledExpectedRuntimeMillis;


  @Deprecated
  // use requestType
  private Optional<Boolean> daemon;

  private Optional<Integer> instances;

  private Optional<Boolean> rackSensitive;
  private Optional<List<String>> rackAffinity;
  private Optional<SlavePlacement> slavePlacement;

  private Optional<Boolean> loadBalanced;

  public SingularityRequestBuilder(String id, RequestType requestType) {
    this.id = id;
    this.requestType = requestType;
    this.owners = Optional.absent();
    this.numRetriesOnFailure = Optional.absent();
    this.schedule = Optional.absent();
    this.scheduleType = Optional.absent();
    this.killOldNonLongRunningTasksAfterMillis = Optional.absent();
    this.instances = Optional.absent();
    this.rackSensitive = Optional.absent();
    this.loadBalanced = Optional.absent();
    this.quartzSchedule = Optional.absent();
    this.rackAffinity = Optional.absent();
    this.slavePlacement = Optional.absent();
    this.scheduledExpectedRuntimeMillis = Optional.absent();
    this.daemon = Optional.absent();
  }

  public SingularityRequest build() {
    return new SingularityRequest(id, requestType, owners, numRetriesOnFailure, schedule, daemon, instances, rackSensitive, loadBalanced, killOldNonLongRunningTasksAfterMillis, scheduleType, quartzSchedule,
        rackAffinity, slavePlacement, scheduledExpectedRuntimeMillis);
  }

  public Optional<Boolean> getLoadBalanced() {
    return loadBalanced;
  }

  public SingularityRequestBuilder setLoadBalanced(Optional<Boolean> loadBalanced) {
    this.loadBalanced = loadBalanced;
    return this;
  }

  public String getId() {
    return id;
  }

  public Optional<List<String>> getOwners() {
    return owners;
  }

  public SingularityRequestBuilder setOwners(Optional<List<String>> owners) {
    this.owners = owners;
    return this;
  }

  public Optional<Integer> getNumRetriesOnFailure() {
    return numRetriesOnFailure;
  }

  public SingularityRequestBuilder setNumRetriesOnFailure(Optional<Integer> numRetriesOnFailure) {
    this.numRetriesOnFailure = numRetriesOnFailure;
    return this;
  }

  public Optional<String> getSchedule() {
    return schedule;
  }

  public SingularityRequestBuilder setSchedule(Optional<String> schedule) {
    this.schedule = schedule;
    return this;
  }

  @Deprecated
  public Optional<Boolean> getDaemon() {
    return daemon;
  }

  @Deprecated
  public SingularityRequestBuilder setDaemon(Optional<Boolean> daemon) {
    this.daemon = daemon;
    return this;
  }

  public Optional<Integer> getInstances() {
    return instances;
  }

  public SingularityRequestBuilder setInstances(Optional<Integer> instances) {
    this.instances = instances;
    return this;
  }

  public Optional<Boolean> getRackSensitive() {
    return rackSensitive;
  }

  public SingularityRequestBuilder setRackSensitive(Optional<Boolean> rackSensitive) {
    this.rackSensitive = rackSensitive;
    return this;
  }

  public Optional<Long> getKillOldNonLongRunningTasksAfterMillis() {
    return killOldNonLongRunningTasksAfterMillis;
  }

  public SingularityRequestBuilder setKillOldNonLongRunningTasksAfterMillis(Optional<Long> killOldNonLongRunningTasksAfterMillis) {
    this.killOldNonLongRunningTasksAfterMillis = killOldNonLongRunningTasksAfterMillis;
    return this;
  }

  public Optional<ScheduleType> getScheduleType() {
    return scheduleType;
  }

  public SingularityRequestBuilder setScheduleType(Optional<ScheduleType> scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  public Optional<String> getQuartzSchedule() {
    return quartzSchedule;
  }

  public SingularityRequestBuilder setQuartzSchedule(Optional<String> quartzSchedule) {
    this.quartzSchedule = quartzSchedule;
    return this;
  }

  public Optional<List<String>> getRackAffinity() {
    return rackAffinity;
  }

  public SingularityRequestBuilder setRackAffinity(Optional<List<String>> rackAffinity) {
    this.rackAffinity = rackAffinity;
    return this;
  }

  public Optional<SlavePlacement> getSlavePlacement() {
    return slavePlacement;
  }

  public SingularityRequestBuilder setSlavePlacement(Optional<SlavePlacement> slavePlacement) {
    this.slavePlacement = slavePlacement;
    return this;
  }

  public Optional<Long> getScheduledExpectedRuntimeMillis() {
    return scheduledExpectedRuntimeMillis;
  }

  public SingularityRequestBuilder setScheduledExpectedRuntimeMillis(Optional<Long> scheduledExpectedRuntimeMillis) {
    this.scheduledExpectedRuntimeMillis = scheduledExpectedRuntimeMillis;
    return this;
  }

  public RequestType getRequestType() {
    return requestType;
  }

  @Override
  public String toString() {
    return "SingularityRequestBuilder [id=" + id + ", requestType=" + requestType + ", owners=" + owners + ", numRetriesOnFailure=" + numRetriesOnFailure + ", schedule=" + schedule
        + ", quartzSchedule=" + quartzSchedule + ", scheduleType=" + scheduleType + ", killOldNonLongRunningTasksAfterMillis=" + killOldNonLongRunningTasksAfterMillis
        + ", scheduledExpectedRuntimeMillis=" + scheduledExpectedRuntimeMillis + ", daemon=" + daemon + ", instances=" + instances + ", rackSensitive=" + rackSensitive + ", rackAffinity="
        + rackAffinity + ", slavePlacement=" + slavePlacement + ", loadBalanced=" + loadBalanced + "]";
  }

}
