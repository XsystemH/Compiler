declare i32 @scanf(ptr, ...);
declare i32 @printf(ptr, ...);
declare i32 @sprintf(ptr, ptr, ...);
declare void @print(ptr);
declare void @println(ptr);
declare void @printInt(i32);
declare void @printlnInt(i32);
declare ptr @malloc(i32);
declare ptr @.malloc(i32);
declare ptr @.malloc_array(i32, i32);
declare i32 @.arr.size(ptr);
declare ptr @getString();
declare i32 @getInt();
declare ptr @toString(i32);
declare ptr @.str.add(ptr, ptr);
declare i1 @.str.eq(ptr, ptr);
declare i1 @.str.ne(ptr, ptr);
declare i1 @.str.lt(ptr, ptr);
declare i1 @.str.le(ptr, ptr);
declare i1 @.str.gt(ptr, ptr);
declare i1 @.str.ge(ptr, ptr);
declare i32 @.str.length(ptr);
declare ptr @.str.substr(ptr, i32, i32);
declare i32 @.str.parseInt(ptr);
declare i32 @.str.ord(ptr, i32);
define void @.init() {
entry:
  ret void
}
define i32 @main() {
entry:
  %a.1.0 = alloca ptr
  %i.1.1 = alloca i32
  %j.1.2 = alloca i32
  %sum.1.3 = alloca i32
  %quotient.1.4 = alloca i32
  %remainder.1.5 = alloca i32
  %.result.27 = alloca i1
  %.result.37 = alloca i1
  call void @.init()
  %.result.0 = call ptr @.malloc_array(i32 4, i32 100)
  store ptr %.result.0, ptr %a.1.0
  store i32 0, ptr %i.1.1
  br label %label_loop_2
label_loop_2:
  %.result.1 = load i32, ptr %i.1.1
  %.result.2 = icmp slt i32 %.result.1, 100
  br i1 %.result.2, label %label_body_3, label %label_skip_1
label_step_0:
  %.result.3 = load i32, ptr %i.1.1
  %.result.4 = add i32 %.result.3, 1
  store i32 %.result.4, ptr %i.1.1
  br label %label_loop_2
label_body_3:
  %.result.5 = load ptr, ptr %a.1.0
  %.result.6 = load i32, ptr %i.1.1
  %.result.7 = getelementptr ptr, ptr %.result.5, i32 %.result.6
  %.result.8 = call ptr @.malloc_array(i32 4, i32 100)
  store ptr %.result.8, ptr %.result.7
  br label %label_step_0
label_skip_1:
  store i32 0, ptr %sum.1.3
  store i32 0, ptr %i.1.1
  br label %label_loop_6
label_loop_6:
  %.result.9 = load i32, ptr %i.1.1
  %.result.10 = icmp slt i32 %.result.9, 100
  br i1 %.result.10, label %label_body_7, label %label_skip_5
label_step_4:
  %.result.11 = load i32, ptr %i.1.1
  %.result.12 = add i32 %.result.11, 1
  store i32 %.result.12, ptr %i.1.1
  br label %label_loop_6
label_body_7:
  store i32 0, ptr %j.1.2
  br label %label_loop_10
label_loop_10:
  %.result.13 = load i32, ptr %j.1.2
  %.result.14 = icmp slt i32 %.result.13, 100
  br i1 %.result.14, label %label_body_11, label %label_skip_9
label_step_8:
  %.result.15 = load i32, ptr %j.1.2
  %.result.16 = add i32 %.result.15, 1
  store i32 %.result.16, ptr %j.1.2
  br label %label_loop_10
label_body_11:
  %.result.17 = load ptr, ptr %a.1.0
  %.result.18 = load i32, ptr %i.1.1
  %.result.19 = getelementptr ptr, ptr %.result.17, i32 %.result.18
  %.result.20 = load ptr, ptr %.result.19
  %.result.21 = load i32, ptr %j.1.2
  %.result.22 = getelementptr ptr, ptr %.result.20, i32 %.result.21
  store i32 0, ptr %.result.22
  br label %label_step_8
label_skip_9:
  br label %label_step_4
label_skip_5:
  store i32 0, ptr %i.1.1
  br label %label_loop_14
label_loop_14:
  %.result.23 = load i32, ptr %i.1.1
  %.result.24 = icmp slt i32 %.result.23, 100
  br i1 %.result.24, label %label_body_15, label %label_skip_13
label_step_12:
  %.result.25 = load i32, ptr %i.1.1
  %.result.26 = add i32 %.result.25, 1
  store i32 %.result.26, ptr %i.1.1
  br label %label_loop_14
label_body_15:
  %.result.28 = load i32, ptr %i.1.1
  %.result.29 = icmp sgt i32 %.result.28, 20
  store i1 %.result.29, ptr %.result.27
  br i1 %.result.29, label %label_logicT_16, label %label_logicF_17
label_logicT_16:
  %.result.30 = load i32, ptr %i.1.1
  %.result.31 = icmp slt i32 %.result.30, 80
  store i1 %.result.31, ptr %.result.27
  br label %label_logicF_17
label_logicF_17:
  %.result.32 = load i1, ptr %.result.27
  br i1 %.result.32, label %label_true_18, label %label_false_19
label_true_18:
  store i32 0, ptr %j.1.2
  br label %label_loop_23
label_loop_23:
  %.result.33 = load i32, ptr %j.1.2
  %.result.34 = icmp slt i32 %.result.33, 100
  br i1 %.result.34, label %label_body_24, label %label_skip_22
label_step_21:
  %.result.35 = load i32, ptr %j.1.2
  %.result.36 = add i32 %.result.35, 1
  store i32 %.result.36, ptr %j.1.2
  br label %label_loop_23
label_body_24:
  %.result.38 = load i32, ptr %j.1.2
  %.result.39 = icmp sgt i32 %.result.38, 5
  store i1 %.result.39, ptr %.result.37
  br i1 %.result.39, label %label_logicT_25, label %label_logicF_26
label_logicF_26:
  %.result.40 = load i32, ptr %i.1.1
  %.result.41 = icmp slt i32 %.result.40, 90
  store i1 %.result.41, ptr %.result.37
  br label %label_logicT_25
label_logicT_25:
  %.result.42 = load i1, ptr %.result.37
  br i1 %.result.42, label %label_true_27, label %label_false_28
label_true_27:
  %.result.43 = load i32, ptr %j.1.2
  %.result.44 = mul i32 %.result.43, 4
  %.result.45 = sdiv i32 %.result.44, 100
  store i32 %.result.45, ptr %quotient.1.4
  %.result.46 = load i32, ptr %j.1.2
  %.result.47 = mul i32 %.result.46, 4
  %.result.48 = srem i32 %.result.47, 100
  store i32 %.result.48, ptr %remainder.1.5
  %.result.49 = load ptr, ptr %a.1.0
  %.result.50 = load i32, ptr %i.1.1
  %.result.51 = load i32, ptr %quotient.1.4
  %.result.52 = add i32 %.result.50, %.result.51
  %.result.53 = getelementptr ptr, ptr %.result.49, i32 %.result.52
  %.result.54 = load ptr, ptr %.result.53
  %.result.55 = load i32, ptr %remainder.1.5
  %.result.56 = getelementptr ptr, ptr %.result.54, i32 %.result.55
  %.result.57 = load i32, ptr %j.1.2
  %.result.58 = sub i32 100, 1
  %.result.59 = add i32 %.result.58, 1
  %.result.60 = sub i32 %.result.59, 1
  %.result.61 = add i32 %.result.60, 1
  %.result.62 = sdiv i32 %.result.61, 2
  %.result.63 = add i32 %.result.57, %.result.62
  store i32 %.result.63, ptr %.result.56
  br label %label_skip_29
label_false_28:
  br label %label_skip_29
label_skip_29:
  br label %label_step_21
label_skip_22:
  br label %label_skip_20
label_false_19:
  br label %label_skip_20
label_skip_20:
  br label %label_step_12
label_skip_13:
  store i32 0, ptr %i.1.1
  br label %label_loop_32
label_loop_32:
  %.result.64 = load i32, ptr %i.1.1
  %.result.65 = icmp slt i32 %.result.64, 100
  br i1 %.result.65, label %label_body_33, label %label_skip_31
label_step_30:
  %.result.66 = load i32, ptr %i.1.1
  %.result.67 = add i32 %.result.66, 1
  store i32 %.result.67, ptr %i.1.1
  br label %label_loop_32
label_body_33:
  store i32 0, ptr %j.1.2
  br label %label_loop_36
label_loop_36:
  %.result.68 = load i32, ptr %j.1.2
  %.result.69 = icmp slt i32 %.result.68, 100
  br i1 %.result.69, label %label_body_37, label %label_skip_35
label_step_34:
  %.result.70 = load i32, ptr %j.1.2
  %.result.71 = add i32 %.result.70, 1
  store i32 %.result.71, ptr %j.1.2
  br label %label_loop_36
label_body_37:
  %.result.72 = load i32, ptr %sum.1.3
  %.result.73 = load ptr, ptr %a.1.0
  %.result.74 = load i32, ptr %i.1.1
  %.result.75 = getelementptr ptr, ptr %.result.73, i32 %.result.74
  %.result.76 = load ptr, ptr %.result.75
  %.result.77 = load i32, ptr %j.1.2
  %.result.78 = getelementptr ptr, ptr %.result.76, i32 %.result.77
  %.result.79 = load i32, ptr %.result.78
  %.result.80 = add i32 %.result.72, %.result.79
  store i32 %.result.80, ptr %sum.1.3
  br label %label_step_34
label_skip_35:
  br label %label_step_30
label_skip_31:
  %.result.81 = load i32, ptr %sum.1.3
  %.result.82 = call ptr @toString(i32 %.result.81)
  call void @println(ptr %.result.82)
  ret i32 0
}
