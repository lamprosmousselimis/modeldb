// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import java.util.*;
import java.util.function.Function;

public class PythonRequirementEnvironmentDiff implements ProtoType {
  public Optional<DiffStatusEnumDiffStatus> Status;
  public Optional<PythonRequirementEnvironmentBlob> A;
  public Optional<PythonRequirementEnvironmentBlob> B;

  public PythonRequirementEnvironmentDiff() {
    this.Status = Optional.empty();
    this.A = Optional.empty();
    this.B = Optional.empty();
  }

  public Boolean isEmpty() {
    if (this.Status.isPresent()) {
      return false;
    }
    if (this.A.isPresent()) {
      return false;
    }
    if (this.B.isPresent()) {
      return false;
    }
    return true;
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof PythonRequirementEnvironmentDiff)) return false;
    PythonRequirementEnvironmentDiff other = (PythonRequirementEnvironmentDiff) o;

    {
      Function3<DiffStatusEnumDiffStatus, DiffStatusEnumDiffStatus, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.Status.isPresent() || other.Status.isPresent()) {
        if (!this.Status.isPresent()) return false;
        if (other.Status.isPresent()) return false;
        if (!f.apply(this.Status.get(), other.Status.get())) return false;
      }
    }
    {
      Function3<PythonRequirementEnvironmentBlob, PythonRequirementEnvironmentBlob, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.A.isPresent() || other.A.isPresent()) {
        if (!this.A.isPresent()) return false;
        if (other.A.isPresent()) return false;
        if (!f.apply(this.A.get(), other.A.get())) return false;
      }
    }
    {
      Function3<PythonRequirementEnvironmentBlob, PythonRequirementEnvironmentBlob, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.B.isPresent() || other.B.isPresent()) {
        if (!this.B.isPresent()) return false;
        if (other.B.isPresent()) return false;
        if (!f.apply(this.B.get(), other.B.get())) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.Status, this.A, this.B);
  }

  public PythonRequirementEnvironmentDiff setStatus(Optional<DiffStatusEnumDiffStatus> value) {
    this.Status = value;
    return this;
  }

  public PythonRequirementEnvironmentDiff setStatus(DiffStatusEnumDiffStatus value) {
    if (value == null) this.Status = Optional.empty();
    else this.Status = Optional.of(value);
    return this;
  }

  public PythonRequirementEnvironmentDiff setA(Optional<PythonRequirementEnvironmentBlob> value) {
    this.A = value;
    return this;
  }

  public PythonRequirementEnvironmentDiff setA(PythonRequirementEnvironmentBlob value) {
    if (value == null) this.A = Optional.empty();
    else this.A = Optional.of(value);
    return this;
  }

  public PythonRequirementEnvironmentDiff setB(Optional<PythonRequirementEnvironmentBlob> value) {
    this.B = value;
    return this;
  }

  public PythonRequirementEnvironmentDiff setB(PythonRequirementEnvironmentBlob value) {
    if (value == null) this.B = Optional.empty();
    else this.B = Optional.of(value);
    return this;
  }

  public static PythonRequirementEnvironmentDiff fromProto(
      ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff blob) {
    if (blob == null) {
      return null;
    }

    PythonRequirementEnvironmentDiff obj = new PythonRequirementEnvironmentDiff();
    {
      Function<
              ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,
              DiffStatusEnumDiffStatus>
          f = x -> DiffStatusEnumDiffStatus.fromProto(blob.getStatus());
      obj.Status = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,
              PythonRequirementEnvironmentBlob>
          f = x -> PythonRequirementEnvironmentBlob.fromProto(blob.getA());
      obj.A = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,
              PythonRequirementEnvironmentBlob>
          f = x -> PythonRequirementEnvironmentBlob.fromProto(blob.getB());
      obj.B = Utils.removeEmpty(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder toProto() {
    ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder builder =
        ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.newBuilder();
    this.Status.ifPresent(x -> builder.setStatus(x.toProto()));
    this.A.ifPresent(x -> builder.setA(x.toProto()));
    this.B.ifPresent(x -> builder.setB(x.toProto()));
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitPythonRequirementEnvironmentDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    if (this.Status.isPresent()) visitor.preVisitDeepDiffStatusEnumDiffStatus(this.Status.get());
    if (this.A.isPresent()) visitor.preVisitDeepPythonRequirementEnvironmentBlob(this.A.get());
    if (this.B.isPresent()) visitor.preVisitDeepPythonRequirementEnvironmentBlob(this.B.get());
  }

  public PythonRequirementEnvironmentDiff postVisitShallow(Visitor visitor)
      throws ModelDBException {
    return visitor.postVisitPythonRequirementEnvironmentDiff(this);
  }

  public PythonRequirementEnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
    if (this.Status.isPresent())
      this.setStatus(visitor.postVisitDeepDiffStatusEnumDiffStatus(this.Status.get()));
    if (this.A.isPresent())
      this.setA(visitor.postVisitDeepPythonRequirementEnvironmentBlob(this.A.get()));
    if (this.B.isPresent())
      this.setB(visitor.postVisitDeepPythonRequirementEnvironmentBlob(this.B.get()));
    return this.postVisitShallow(visitor);
  }
}