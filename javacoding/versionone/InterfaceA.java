package javacoding.versionone;

public interface InterfaceA {
  void methodA();

  String methodB();

  default String methodD() {
    return "这是确认方法";
  }

  static double methodE() {
    return 0.0;
  }

  default int methodC() {
    return 0;
  };
}